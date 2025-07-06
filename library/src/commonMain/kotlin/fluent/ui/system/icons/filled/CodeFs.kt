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
 * CodeFs Icon (16dp)
 * 
 * **Icon details:**
 * - Style: Filled
 * - Size: 16dp
 * - Keywords: fluent-icon, visual studio code
 * - Description: Used to represent F# language.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_code_fs_16_filled.svg)
 * 
 * @return The [ImageVector] for the CodeFs icon.
 */
public val FluentIcons.Filled.CodeFs: ImageVector
    get() {
        if (_codeFs != null) {
            return _codeFs!!
        }
        _codeFs = Builder(name = "CodeFs", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.5f, 3.75f)
                horizontalLineTo(6.0f)
                curveTo(6.2f, 3.75f, 6.388f, 3.829f, 6.53f, 3.97f)
                curveTo(6.672f, 4.111f, 6.75f, 4.3f, 6.75f, 4.5f)
                curveTo(6.75f, 4.7f, 6.671f, 4.888f, 6.53f, 5.03f)
                curveTo(6.389f, 5.172f, 6.2f, 5.25f, 6.0f, 5.25f)
                horizontalLineTo(3.25f)
                verticalLineTo(7.25f)
                horizontalLineTo(5.5f)
                curveTo(5.7f, 7.25f, 5.888f, 7.329f, 6.03f, 7.47f)
                curveTo(6.172f, 7.611f, 6.25f, 7.8f, 6.25f, 8.0f)
                curveTo(6.25f, 8.2f, 6.171f, 8.388f, 6.03f, 8.53f)
                curveTo(5.889f, 8.672f, 5.7f, 8.75f, 5.5f, 8.75f)
                horizontalLineTo(3.25f)
                verticalLineTo(11.5f)
                curveTo(3.25f, 11.7f, 3.171f, 11.888f, 3.03f, 12.03f)
                curveTo(2.889f, 12.172f, 2.7f, 12.25f, 2.5f, 12.25f)
                curveTo(2.3f, 12.25f, 2.112f, 12.171f, 1.97f, 12.03f)
                curveTo(1.828f, 11.889f, 1.75f, 11.7f, 1.75f, 11.5f)
                verticalLineTo(4.5f)
                curveTo(1.75f, 4.3f, 1.829f, 4.112f, 1.97f, 3.97f)
                curveTo(2.111f, 3.828f, 2.3f, 3.75f, 2.5f, 3.75f)
                close()
                moveTo(13.25f, 8.75f)
                horizontalLineTo(14.249f)
                curveTo(14.449f, 8.75f, 14.637f, 8.829f, 14.779f, 8.97f)
                curveTo(14.921f, 9.111f, 14.999f, 9.3f, 14.999f, 9.5f)
                curveTo(14.999f, 9.7f, 14.92f, 9.888f, 14.779f, 10.03f)
                curveTo(14.638f, 10.172f, 14.449f, 10.25f, 14.249f, 10.25f)
                horizontalLineTo(13.249f)
                verticalLineTo(11.0f)
                curveTo(13.249f, 11.2f, 13.17f, 11.388f, 13.029f, 11.53f)
                curveTo(12.888f, 11.672f, 12.699f, 11.75f, 12.499f, 11.75f)
                curveTo(12.299f, 11.75f, 12.111f, 11.671f, 11.969f, 11.53f)
                curveTo(11.827f, 11.389f, 11.749f, 11.2f, 11.749f, 11.0f)
                verticalLineTo(10.25f)
                horizontalLineTo(10.249f)
                verticalLineTo(11.0f)
                curveTo(10.249f, 11.2f, 10.171f, 11.388f, 10.029f, 11.53f)
                curveTo(9.745f, 11.813f, 9.251f, 11.813f, 8.968f, 11.53f)
                curveTo(8.826f, 11.389f, 8.748f, 11.2f, 8.748f, 11.0f)
                verticalLineTo(10.25f)
                horizontalLineTo(7.998f)
                curveTo(7.798f, 10.25f, 7.61f, 10.171f, 7.468f, 10.03f)
                curveTo(7.326f, 9.889f, 7.248f, 9.7f, 7.248f, 9.5f)
                curveTo(7.248f, 9.3f, 7.327f, 9.112f, 7.468f, 8.97f)
                curveTo(7.609f, 8.828f, 7.798f, 8.75f, 7.998f, 8.75f)
                horizontalLineTo(8.748f)
                verticalLineTo(7.25f)
                horizontalLineTo(7.998f)
                curveTo(7.798f, 7.25f, 7.61f, 7.171f, 7.468f, 7.03f)
                curveTo(7.326f, 6.889f, 7.248f, 6.7f, 7.248f, 6.5f)
                curveTo(7.248f, 6.3f, 7.327f, 6.112f, 7.468f, 5.97f)
                curveTo(7.609f, 5.828f, 7.798f, 5.75f, 7.998f, 5.75f)
                horizontalLineTo(8.748f)
                verticalLineTo(5.0f)
                curveTo(8.748f, 4.8f, 8.826f, 4.612f, 8.968f, 4.47f)
                curveTo(9.252f, 4.187f, 9.746f, 4.187f, 10.029f, 4.47f)
                curveTo(10.171f, 4.611f, 10.249f, 4.8f, 10.249f, 5.0f)
                verticalLineTo(5.75f)
                horizontalLineTo(11.749f)
                verticalLineTo(5.0f)
                curveTo(11.749f, 4.8f, 11.827f, 4.612f, 11.969f, 4.47f)
                curveTo(12.253f, 4.187f, 12.747f, 4.187f, 13.03f, 4.47f)
                curveTo(13.172f, 4.611f, 13.25f, 4.8f, 13.25f, 5.0f)
                verticalLineTo(5.75f)
                horizontalLineTo(14.25f)
                curveTo(14.45f, 5.75f, 14.638f, 5.829f, 14.78f, 5.97f)
                curveTo(14.922f, 6.111f, 15.0f, 6.3f, 15.0f, 6.5f)
                curveTo(15.0f, 6.7f, 14.921f, 6.888f, 14.78f, 7.03f)
                curveTo(14.639f, 7.172f, 14.45f, 7.25f, 14.25f, 7.25f)
                horizontalLineTo(13.25f)
                verticalLineTo(8.75f)
                close()
                moveTo(11.75f, 8.75f)
                verticalLineTo(7.25f)
                horizontalLineTo(10.25f)
                verticalLineTo(8.75f)
                horizontalLineTo(11.75f)
                close()
            }
        }
        .build()
        return _codeFs!!
    }

@Suppress("ObjectPropertyName")
private var _codeFs: ImageVector? = null

@Preview
@Composable
private fun CodeFsPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.CodeFs, contentDescription = "CodeFs Icon")
    }
}

