package com.mercadolibre.joao_magalhaes.domain.service.impl;


import com.mercadolibre.joao_magalhaes.domain.dtos.form.InboundOrderForm;
import com.mercadolibre.joao_magalhaes.domain.dtos.mapper.OrderFormMapper;
import com.mercadolibre.joao_magalhaes.domain.dtos.mapper.StockFormMapper;
import com.mercadolibre.joao_magalhaes.domain.dtos.mapper.StockViewMapper;
import com.mercadolibre.joao_magalhaes.domain.dtos.view.StockView;
import com.mercadolibre.joao_magalhaes.domain.model.InboundOrder;
import com.mercadolibre.joao_magalhaes.domain.model.Product;
import com.mercadolibre.joao_magalhaes.domain.model.Section;
import com.mercadolibre.joao_magalhaes.domain.model.Stock;
import com.mercadolibre.joao_magalhaes.domain.repository.OrderRepository;
import com.mercadolibre.joao_magalhaes.domain.repository.ProductRepository;
import com.mercadolibre.joao_magalhaes.domain.service.CreateOrderService;
import com.mercadolibre.joao_magalhaes.domain.service.FindProductService;
import com.mercadolibre.joao_magalhaes.domain.service.RetrieveSectionService;
import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
public class ImplCreateOrder implements CreateOrderService {

    private final OrderRepository orderRepository;
    private final StockViewMapper stockViewMapper;
    private final OrderFormMapper orderFormMapper;
    private final RetrieveSectionService retrieveSectionService;
    private final StockFormMapper stockFormMapper;
    private final FindProductService findProductService;


    @Override
    public List<StockView> create(InboundOrderForm form) {
        Section section = retrieveSectionService.findByNameAndWareHouse(
                form.getSection().getSectionCode(),
                form.getSection().getWarehouseCode());


        List<Stock> stockList = form.getBatchStock().stream().map(e ->
            stockFormMapper.map(e, findProductService.findById(e.getProductId()))
        ).collect(Collectors.toList());

        InboundOrder order = orderFormMapper.map(form, stockList, section);

        InboundOrder inboundOrder = orderRepository.save(order);

        return stockViewMapper.mapOrderInStockList(inboundOrder);

    }
}
