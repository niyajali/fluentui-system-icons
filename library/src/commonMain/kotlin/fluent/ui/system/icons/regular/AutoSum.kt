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
 * AutoSum Icon (24dp)
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: fluent-icon
 * - Description: Used to insert math formula into content.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_autosum_24_regular.svg)
 * 
 * @return The [ImageVector] for the AutoSum icon.
 */
public val FluentIcons.Regular.AutoSum: ImageVector
    get() {
        if (_autoSum != null) {
            return _autoSum!!
        }
        _autoSum = Builder(name = "AutoSum", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.059f, 4.457f)
                curveTo(5.177f, 4.18f, 5.449f, 4.0f, 5.75f, 4.0f)
                horizontalLineTo(18.25f)
                curveTo(18.664f, 4.0f, 19.0f, 4.336f, 19.0f, 4.75f)
                curveTo(19.0f, 5.164f, 18.664f, 5.5f, 18.25f, 5.5f)
                horizontalLineTo(7.52f)
                lineTo(12.88f, 11.039f)
                curveTo(13.149f, 11.317f, 13.162f, 11.755f, 12.91f, 12.049f)
                lineTo(7.381f, 18.5f)
                horizontalLineTo(18.25f)
                curveTo(18.664f, 18.5f, 19.0f, 18.836f, 19.0f, 19.25f)
                curveTo(19.0f, 19.664f, 18.664f, 20.0f, 18.25f, 20.0f)
                horizontalLineTo(5.75f)
                curveTo(5.457f, 20.0f, 5.191f, 19.83f, 5.069f, 19.563f)
                curveTo(4.946f, 19.297f, 4.99f, 18.984f, 5.181f, 18.762f)
                lineTo(11.327f, 11.591f)
                lineTo(5.211f, 5.272f)
                curveTo(5.002f, 5.055f, 4.942f, 4.735f, 5.059f, 4.457f)
                close()
            }
        }
        .build()
        return _autoSum!!
    }

@Suppress("ObjectPropertyName")
private var _autoSum: ImageVector? = null

@Preview
@Composable
private fun AutoSumPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.AutoSum, contentDescription = "AutoSum Icon")
    }
}

