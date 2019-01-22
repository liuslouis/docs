/*
 * QES Quant Service API
 * QES Quant Service API provides easy access to Risk/Optimization API 
 *
 * OpenAPI spec version: 0.0.4
 * Contact: luo.qes@wolferesearch.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.model.FactorModel;
import io.swagger.client.model.MetaModel;
import io.swagger.client.model.PortfolioModel;
import io.swagger.client.model.RiskModelTemplate;
import io.swagger.client.model.TemplateModel;
import io.swagger.client.model.UniverseModel;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for CatalogApi
 */
@Ignore
public class CatalogApiTest {

    private final CatalogApi api = new CatalogApi();

    
    /**
     * Creates new optimization template
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createOptimizationTemplateTest() throws ApiException {
        TemplateModel body = null;
        api.createOptimizationTemplate(body);

        // TODO: test validations
    }
    
    /**
     * Creates / Updates Portoflio
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createPortfolioTest() throws ApiException {
        RiskModelTemplate body = null;
        api.createPortfolio(body);

        // TODO: test validations
    }
    
    /**
     * Creates / Updates Risk Model Template based on ...
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createRiskModelTemplateTest() throws ApiException {
        TemplateModel body = null;
        api.createRiskModelTemplate(body);

        // TODO: test validations
    }
    
    /**
     * Gets the list of applicable factors
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getFactorListTest() throws ApiException {
        List<FactorModel> response = api.getFactorList();

        // TODO: test validations
    }
    
    /**
     * Gets the list of applicable meta fields
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getMetaListTest() throws ApiException {
        List<MetaModel> response = api.getMetaList();

        // TODO: test validations
    }
    
    /**
     * Gets the list of applicable portfolios
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPortfolioListTest() throws ApiException {
        List<PortfolioModel> response = api.getPortfolioList();

        // TODO: test validations
    }
    
    /**
     * Gets the list of appicable templates
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTemplateListTest() throws ApiException {
        List<TemplateModel> response = api.getTemplateList();

        // TODO: test validations
    }
    
    /**
     * Gets the list of applicable universes
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getUniverseListTest() throws ApiException {
        List<UniverseModel> response = api.getUniverseList();

        // TODO: test validations
    }
    
}
