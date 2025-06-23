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

public val FluentIcons.Regular.ArrowTrending: ImageVector
    get() {
        if (_ArrowTrending != null) {
            return _ArrowTrending!!
        }
        _ArrowTrending = ImageVector.Builder(
            name = "Regular.ArrowTrending",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(13.749f, 5.5f)
                lineTo(21.303f, 5.501f)
                lineTo(21.403f, 5.514f)
                lineTo(21.502f, 5.542f)
                lineTo(21.562f, 5.568f)
                curveTo(21.641f, 5.602f, 21.715f, 5.653f, 21.781f, 5.718f)
                lineTo(21.822f, 5.762f)
                lineTo(21.865f, 5.819f)
                lineTo(21.919f, 5.909f)
                lineTo(21.958f, 5.999f)
                lineTo(21.977f, 6.063f)
                lineTo(21.991f, 6.127f)
                lineTo(22f, 6.221f)
                lineTo(22f, 13.754f)
                curveTo(22f, 14.168f, 21.665f, 14.504f, 21.25f, 14.504f)
                curveTo(20.871f, 14.504f, 20.557f, 14.222f, 20.507f, 13.856f)
                lineTo(20.5f, 13.754f)
                lineTo(20.5f, 8.059f)
                lineTo(12.781f, 15.779f)
                curveTo(12.515f, 16.045f, 12.098f, 16.07f, 11.805f, 15.852f)
                lineTo(11.72f, 15.779f)
                lineTo(8.75f, 12.809f)
                lineTo(3.28f, 18.279f)
                curveTo(2.987f, 18.572f, 2.513f, 18.572f, 2.22f, 18.279f)
                curveTo(1.953f, 18.012f, 1.929f, 17.596f, 2.147f, 17.302f)
                lineTo(2.22f, 17.218f)
                lineTo(8.22f, 11.218f)
                curveTo(8.486f, 10.952f, 8.903f, 10.927f, 9.196f, 11.145f)
                lineTo(9.28f, 11.218f)
                lineTo(12.251f, 14.188f)
                lineTo(19.438f, 7f)
                horizontalLineTo(13.749f)
                curveTo(13.369f, 7f, 13.055f, 6.718f, 13.006f, 6.352f)
                lineTo(12.999f, 6.25f)
                curveTo(12.999f, 5.87f, 13.281f, 5.557f, 13.647f, 5.507f)
                lineTo(13.749f, 5.5f)
                close()
            }
        }.build()

        return _ArrowTrending!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowTrending: ImageVector? = null

@Preview
@Composable
private fun ArrowTrendingPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.ArrowTrending, contentDescription = null)
    }
}
