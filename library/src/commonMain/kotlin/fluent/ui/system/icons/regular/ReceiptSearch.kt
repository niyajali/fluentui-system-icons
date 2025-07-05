/*
 * MIT License
 *
 * Copyright (c) 2020 Microsoft Corporation
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package fluent.ui.system.icons.regular

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentIcons
import org.jetbrains.compose.ui.tooling.preview.Preview

/**
 * ReceiptSearch Icon (20dp)
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 20dp
 * - Keywords: fluent-icon
 * - Description: Used to represent a receipt, purchase order, line items or an invoice.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_receipt_search_20_regular.svg)
 * 
 * @return The [ImageVector] for the ReceiptSearch icon.
 */
public val FluentIcons.Regular.ReceiptSearch: ImageVector
    get() {
        if (_receiptSearch != null) {
            return _receiptSearch!!
        }
        _receiptSearch = Builder(name = "ReceiptSearch", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.0f, 3.0f)
                curveTo(4.895f, 3.0f, 4.0f, 3.895f, 4.0f, 5.0f)
                verticalLineTo(9.256f)
                curveTo(4.318f, 9.144f, 4.653f, 9.066f, 5.0f, 9.027f)
                verticalLineTo(5.0f)
                curveTo(5.0f, 4.448f, 5.448f, 4.0f, 6.0f, 4.0f)
                horizontalLineTo(13.0f)
                curveTo(13.552f, 4.0f, 14.0f, 4.448f, 14.0f, 5.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(10.121f)
                lineTo(11.121f, 17.0f)
                horizontalLineTo(15.0f)
                curveTo(16.657f, 17.0f, 18.0f, 15.657f, 18.0f, 14.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(5.0f)
                curveTo(15.0f, 3.895f, 14.105f, 3.0f, 13.0f, 3.0f)
                horizontalLineTo(6.0f)
                close()
                moveTo(8.329f, 10.0f)
                horizontalLineTo(11.5f)
                curveTo(11.776f, 10.0f, 12.0f, 9.776f, 12.0f, 9.5f)
                curveTo(12.0f, 9.224f, 11.776f, 9.0f, 11.5f, 9.0f)
                horizontalLineTo(7.5f)
                curveTo(7.305f, 9.0f, 7.136f, 9.112f, 7.053f, 9.275f)
                curveTo(7.519f, 9.447f, 7.95f, 9.693f, 8.329f, 10.0f)
                close()
                moveTo(15.0f, 16.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(14.0f)
                curveTo(17.0f, 15.105f, 16.105f, 16.0f, 15.0f, 16.0f)
                close()
                moveTo(7.5f, 6.0f)
                curveTo(7.224f, 6.0f, 7.0f, 6.224f, 7.0f, 6.5f)
                curveTo(7.0f, 6.776f, 7.224f, 7.0f, 7.5f, 7.0f)
                horizontalLineTo(11.5f)
                curveTo(11.776f, 7.0f, 12.0f, 6.776f, 12.0f, 6.5f)
                curveTo(12.0f, 6.224f, 11.776f, 6.0f, 11.5f, 6.0f)
                horizontalLineTo(7.5f)
                close()
                moveTo(5.5f, 17.0f)
                curveTo(6.286f, 17.0f, 7.012f, 16.741f, 7.596f, 16.303f)
                lineTo(10.146f, 18.854f)
                curveTo(10.342f, 19.049f, 10.658f, 19.049f, 10.854f, 18.854f)
                curveTo(11.049f, 18.658f, 11.049f, 18.342f, 10.854f, 18.146f)
                lineTo(8.303f, 15.596f)
                curveTo(8.741f, 15.012f, 9.0f, 14.286f, 9.0f, 13.5f)
                curveTo(9.0f, 11.567f, 7.433f, 10.0f, 5.5f, 10.0f)
                curveTo(3.567f, 10.0f, 2.0f, 11.567f, 2.0f, 13.5f)
                curveTo(2.0f, 15.433f, 3.567f, 17.0f, 5.5f, 17.0f)
                close()
                moveTo(5.5f, 16.0f)
                curveTo(4.119f, 16.0f, 3.0f, 14.881f, 3.0f, 13.5f)
                curveTo(3.0f, 12.119f, 4.119f, 11.0f, 5.5f, 11.0f)
                curveTo(6.881f, 11.0f, 8.0f, 12.119f, 8.0f, 13.5f)
                curveTo(8.0f, 14.881f, 6.881f, 16.0f, 5.5f, 16.0f)
                close()
            }
        }
        .build()
        return _receiptSearch!!
    }

@Suppress("ObjectPropertyName")
private var _receiptSearch: ImageVector? = null

@Preview
@Composable
private fun ReceiptSearchPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.ReceiptSearch, contentDescription = "ReceiptSearch Icon")
    }
}

