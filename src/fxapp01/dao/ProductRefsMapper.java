/*
 * Copyright 2015 serg.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package fxapp01.dao;

import fxapp01.dto.INestedRange;
import java.math.BigInteger;
import java.util.List;
import fxapp01.dto.ProductRefs;
import fxapp01.dto.ProductRefsQBE;

public interface ProductRefsMapper {
    List<ProductRefs> select(INestedRange rowsrange);
    ProductRefs selectByID(BigInteger id);
    INestedRange selectTotalRange();
    List<ProductRefs> selectBE(ProductRefsQBE qbe);
    int insertRow(ProductRefs item);
    ProductRefs insertRowBySP(ProductRefs item);
    ProductRefs insertRowBySP2(ProductRefs item);
}
