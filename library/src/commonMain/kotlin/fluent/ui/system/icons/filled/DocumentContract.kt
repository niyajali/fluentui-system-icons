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

package fluent.ui.system.icons.filled

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
 * DocumentContract Icon (16dp)
 * 
 * **Icon details:**
 * - Style: Filled
 * - Size: 16dp
 * - Keywords: fluent-icon, visual studio code
 * - Description: Used to represent a contract.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_document_contract_16_filled.svg)
 * 
 * @return The [ImageVector] for the DocumentContract icon.
 */
public val FluentIcons.Filled.DocumentContract: ImageVector
    get() {
        if (_documentContract != null) {
            return _documentContract!!
        }
        _documentContract = Builder(name = "DocumentContract", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.5f, 5.0f)
                horizontalLineTo(12.75f)
                lineTo(9.0f, 1.25f)
                verticalLineTo(4.5f)
                curveTo(9.0f, 4.776f, 9.224f, 5.0f, 9.5f, 5.0f)
                close()
                moveTo(9.5f, 6.0f)
                curveTo(8.672f, 6.0f, 8.0f, 5.328f, 8.0f, 4.5f)
                verticalLineTo(1.0f)
                horizontalLineTo(4.5f)
                curveTo(3.672f, 1.0f, 3.0f, 1.672f, 3.0f, 2.5f)
                verticalLineTo(13.5f)
                curveTo(3.0f, 14.328f, 3.672f, 15.0f, 4.5f, 15.0f)
                horizontalLineTo(11.5f)
                curveTo(12.328f, 15.0f, 13.0f, 14.328f, 13.0f, 13.5f)
                verticalLineTo(6.0f)
                horizontalLineTo(9.5f)
                close()
                moveTo(7.85f, 11.15f)
                curveTo(7.9f, 11.19f, 7.94f, 11.25f, 7.96f, 11.31f)
                curveTo(7.99f, 11.37f, 8.0f, 11.43f, 8.0f, 11.5f)
                curveTo(8.0f, 11.57f, 7.99f, 11.63f, 7.96f, 11.69f)
                curveTo(7.94f, 11.75f, 7.9f, 11.81f, 7.85f, 11.85f)
                curveTo(7.81f, 11.9f, 7.75f, 11.94f, 7.69f, 11.96f)
                curveTo(7.63f, 11.99f, 7.57f, 12.0f, 7.5f, 12.0f)
                curveTo(7.43f, 12.0f, 7.37f, 11.99f, 7.31f, 11.96f)
                curveTo(7.25f, 11.94f, 7.19f, 11.9f, 7.15f, 11.85f)
                lineTo(6.5f, 11.21f)
                lineTo(5.85f, 11.85f)
                curveTo(5.81f, 11.9f, 5.75f, 11.94f, 5.69f, 11.96f)
                curveTo(5.63f, 11.99f, 5.57f, 12.0f, 5.5f, 12.0f)
                curveTo(5.43f, 12.0f, 5.37f, 11.99f, 5.31f, 11.96f)
                curveTo(5.25f, 11.94f, 5.19f, 11.9f, 5.15f, 11.85f)
                curveTo(5.1f, 11.81f, 5.06f, 11.75f, 5.04f, 11.69f)
                curveTo(5.01f, 11.63f, 5.0f, 11.57f, 5.0f, 11.5f)
                curveTo(5.0f, 11.43f, 5.01f, 11.37f, 5.04f, 11.31f)
                curveTo(5.06f, 11.25f, 5.1f, 11.19f, 5.15f, 11.15f)
                lineTo(5.79f, 10.5f)
                lineTo(5.15f, 9.85f)
                curveTo(5.05f, 9.76f, 5.0f, 9.63f, 5.0f, 9.5f)
                curveTo(5.0f, 9.37f, 5.05f, 9.24f, 5.15f, 9.15f)
                curveTo(5.24f, 9.05f, 5.37f, 9.0f, 5.5f, 9.0f)
                curveTo(5.63f, 9.0f, 5.76f, 9.05f, 5.85f, 9.15f)
                lineTo(6.5f, 9.79f)
                lineTo(7.15f, 9.15f)
                curveTo(7.24f, 9.05f, 7.37f, 9.0f, 7.5f, 9.0f)
                curveTo(7.63f, 9.0f, 7.76f, 9.05f, 7.85f, 9.15f)
                curveTo(7.95f, 9.24f, 8.0f, 9.37f, 8.0f, 9.5f)
                curveTo(8.0f, 9.63f, 7.95f, 9.76f, 7.85f, 9.85f)
                lineTo(7.21f, 10.5f)
                lineTo(7.85f, 11.15f)
                verticalLineTo(11.15f)
                close()
                moveTo(12.0f, 12.0f)
                horizontalLineTo(9.5f)
                curveTo(9.37f, 12.0f, 9.24f, 11.95f, 9.15f, 11.85f)
                curveTo(9.05f, 11.76f, 9.0f, 11.63f, 9.0f, 11.5f)
                curveTo(9.0f, 11.37f, 9.05f, 11.24f, 9.15f, 11.15f)
                curveTo(9.24f, 11.05f, 9.37f, 11.0f, 9.5f, 11.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(12.0f)
                close()
            }
        }
        .build()
        return _documentContract!!
    }

@Suppress("ObjectPropertyName")
private var _documentContract: ImageVector? = null

@Preview
@Composable
private fun DocumentContractPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.DocumentContract, contentDescription = "DocumentContract Icon")
    }
}

