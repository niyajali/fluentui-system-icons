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
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import org.jetbrains.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentIcons

public val FluentIcons.Regular.ArrowTrendingDown: ImageVector
    get() {
        if (_ArrowTrendingDown != null) {
            return _ArrowTrendingDown!!
        }
        _ArrowTrendingDown = ImageVector.Builder(
            name = "Regular.ArrowTrendingDown",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(13.749f, 18.5f)
                lineTo(21.303f, 18.5f)
                lineTo(21.403f, 18.486f)
                lineTo(21.502f, 18.458f)
                lineTo(21.562f, 18.433f)
                curveTo(21.641f, 18.398f, 21.715f, 18.347f, 21.781f, 18.282f)
                lineTo(21.822f, 18.238f)
                lineTo(21.865f, 18.181f)
                lineTo(21.919f, 18.091f)
                lineTo(21.958f, 18.001f)
                lineTo(21.977f, 17.937f)
                lineTo(21.991f, 17.873f)
                lineTo(22f, 17.779f)
                lineTo(22f, 10.246f)
                curveTo(22f, 9.832f, 21.665f, 9.496f, 21.25f, 9.496f)
                curveTo(20.871f, 9.496f, 20.557f, 9.778f, 20.507f, 10.145f)
                lineTo(20.5f, 10.246f)
                lineTo(20.5f, 15.941f)
                lineTo(12.781f, 8.221f)
                curveTo(12.515f, 7.955f, 12.098f, 7.93f, 11.805f, 8.148f)
                lineTo(11.72f, 8.221f)
                lineTo(8.75f, 11.191f)
                lineTo(3.28f, 5.722f)
                curveTo(2.987f, 5.429f, 2.513f, 5.429f, 2.22f, 5.722f)
                curveTo(1.953f, 5.988f, 1.929f, 6.405f, 2.147f, 6.698f)
                lineTo(2.22f, 6.782f)
                lineTo(8.22f, 12.782f)
                curveTo(8.486f, 13.049f, 8.903f, 13.073f, 9.196f, 12.855f)
                lineTo(9.28f, 12.782f)
                lineTo(12.251f, 9.812f)
                lineTo(19.438f, 17f)
                horizontalLineTo(13.749f)
                curveTo(13.369f, 17f, 13.055f, 17.282f, 13.006f, 17.649f)
                lineTo(12.999f, 17.75f)
                curveTo(12.999f, 18.13f, 13.281f, 18.444f, 13.647f, 18.493f)
                lineTo(13.749f, 18.5f)
                close()
            }
        }.build()

        return _ArrowTrendingDown!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowTrendingDown: ImageVector? = null

@Preview
@Composable
private fun ArrowTrendingDownPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.ArrowTrendingDown, contentDescription = null)
    }
}
