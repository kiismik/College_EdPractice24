package task_8_Store;

interface StoreAbstractVisitor {
    String visit(Staff staff);
    String visit(StoreManager manager);
    String visit(ProductCategory category);
    String visitElectronicProduct(ElectronicProduct product);
    String visitInternalTool(InternalTool tool);
}
