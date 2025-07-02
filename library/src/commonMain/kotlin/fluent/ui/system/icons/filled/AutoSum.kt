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
 * AutoSum icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Filled
 * - Size: 24dp
 * - Keywords: auto, sum
 * - Source: ic_fluent_autosum_24_filled.svg
 * 
 * @return The [ImageVector] for the AutoSum icon.
 */
public val FluentIcons.Filled.AutoSum: ImageVector
    get() {
        if (_autoSum != null) {
            return _autoSum!!
        }
        _autoSum = Builder(name = "AutoSum", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.829f, 4.61f)
                curveTo(4.986f, 4.24f, 5.349f, 4.0f, 5.75f, 4.0f)
                horizontalLineTo(18.25f)
                curveTo(18.802f, 4.0f, 19.25f, 4.448f, 19.25f, 5.0f)
                curveTo(19.25f, 5.552f, 18.802f, 6.0f, 18.25f, 6.0f)
                horizontalLineTo(8.109f)
                lineTo(13.059f, 11.115f)
                curveTo(13.418f, 11.486f, 13.436f, 12.069f, 13.1f, 12.461f)
                lineTo(7.924f, 18.5f)
                horizontalLineTo(18.25f)
                curveTo(18.802f, 18.5f, 19.25f, 18.948f, 19.25f, 19.5f)
                curveTo(19.25f, 20.052f, 18.802f, 20.5f, 18.25f, 20.5f)
                horizontalLineTo(5.75f)
                curveTo(5.359f, 20.5f, 5.005f, 20.273f, 4.842f, 19.918f)
                curveTo(4.678f, 19.563f, 4.737f, 19.146f, 4.991f, 18.849f)
                lineTo(10.989f, 11.851f)
                lineTo(5.031f, 5.695f)
                curveTo(4.752f, 5.407f, 4.673f, 4.979f, 4.829f, 4.61f)
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
        Image(imageVector = FluentIcons.Filled.AutoSum, contentDescription = null)
    }
}

