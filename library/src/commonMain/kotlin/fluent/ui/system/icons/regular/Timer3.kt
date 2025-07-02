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
 * Timer3 icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: timer3
 * - Source: ic_fluent_timer_3_24_regular.svg
 * 
 * @return The [ImageVector] for the Timer3 icon.
 */
public val FluentIcons.Regular.Timer3: ImageVector
    get() {
        if (_timer3 != null) {
            return _timer3!!
        }
        _timer3 = Builder(name = "Timer3", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(20.393f, 12.148f)
                curveTo(19.745f, 8.096f, 16.234f, 5.0f, 12.0f, 5.0f)
                curveTo(7.306f, 5.0f, 3.5f, 8.806f, 3.5f, 13.5f)
                curveTo(3.5f, 18.194f, 7.306f, 22.0f, 12.0f, 22.0f)
                curveTo(13.06f, 22.0f, 14.075f, 21.806f, 15.01f, 21.452f)
                curveTo(14.819f, 20.876f, 14.932f, 20.217f, 15.366f, 19.732f)
                curveTo(15.457f, 19.63f, 15.557f, 19.541f, 15.665f, 19.465f)
                curveTo(14.599f, 20.122f, 13.344f, 20.5f, 12.0f, 20.5f)
                curveTo(8.134f, 20.5f, 5.0f, 17.366f, 5.0f, 13.5f)
                curveTo(5.0f, 9.634f, 8.134f, 6.5f, 12.0f, 6.5f)
                curveTo(15.357f, 6.5f, 18.163f, 8.864f, 18.843f, 12.018f)
                curveTo(18.976f, 12.006f, 19.111f, 12.0f, 19.25f, 12.0f)
                curveTo(19.632f, 12.0f, 20.018f, 12.05f, 20.393f, 12.148f)
                close()
                moveTo(12.743f, 8.648f)
                curveTo(12.693f, 8.282f, 12.38f, 8.0f, 12.0f, 8.0f)
                curveTo(11.586f, 8.0f, 11.25f, 8.336f, 11.25f, 8.75f)
                verticalLineTo(13.25f)
                lineTo(11.257f, 13.352f)
                curveTo(11.307f, 13.718f, 11.62f, 14.0f, 12.0f, 14.0f)
                curveTo(12.414f, 14.0f, 12.75f, 13.664f, 12.75f, 13.25f)
                verticalLineTo(8.75f)
                lineTo(12.743f, 8.648f)
                close()
                moveTo(19.23f, 5.174f)
                lineTo(19.147f, 5.114f)
                curveTo(18.834f, 4.918f, 18.417f, 4.978f, 18.174f, 5.27f)
                curveTo(17.909f, 5.589f, 17.952f, 6.061f, 18.27f, 6.326f)
                lineTo(19.429f, 7.291f)
                lineTo(19.511f, 7.35f)
                curveTo(19.824f, 7.546f, 20.242f, 7.486f, 20.485f, 7.194f)
                curveTo(20.75f, 6.876f, 20.707f, 6.403f, 20.388f, 6.138f)
                lineTo(19.23f, 5.174f)
                close()
                moveTo(15.0f, 3.25f)
                curveTo(15.0f, 2.836f, 14.664f, 2.5f, 14.25f, 2.5f)
                horizontalLineTo(9.75f)
                lineTo(9.648f, 2.507f)
                curveTo(9.282f, 2.557f, 9.0f, 2.87f, 9.0f, 3.25f)
                curveTo(9.0f, 3.664f, 9.336f, 4.0f, 9.75f, 4.0f)
                horizontalLineTo(14.25f)
                lineTo(14.352f, 3.993f)
                curveTo(14.718f, 3.943f, 15.0f, 3.63f, 15.0f, 3.25f)
                close()
                moveTo(18.25f, 18.0f)
                curveTo(18.25f, 17.586f, 18.586f, 17.25f, 19.0f, 17.25f)
                curveTo(19.528f, 17.25f, 20.058f, 17.065f, 20.444f, 16.777f)
                curveTo(20.835f, 16.485f, 21.0f, 16.154f, 21.0f, 15.875f)
                curveTo(21.0f, 15.225f, 20.335f, 14.5f, 19.25f, 14.5f)
                curveTo(18.734f, 14.5f, 18.237f, 14.69f, 17.845f, 14.906f)
                curveTo(17.653f, 15.012f, 17.498f, 15.118f, 17.393f, 15.196f)
                curveTo(17.341f, 15.235f, 17.301f, 15.267f, 17.277f, 15.287f)
                curveTo(17.264f, 15.297f, 17.256f, 15.304f, 17.251f, 15.308f)
                lineTo(17.248f, 15.311f)
                curveTo(16.939f, 15.585f, 16.466f, 15.558f, 16.191f, 15.25f)
                curveTo(15.915f, 14.941f, 15.942f, 14.466f, 16.251f, 14.19f)
                lineTo(16.252f, 14.189f)
                lineTo(16.254f, 14.188f)
                lineTo(16.259f, 14.183f)
                lineTo(16.274f, 14.17f)
                curveTo(16.287f, 14.159f, 16.304f, 14.145f, 16.325f, 14.127f)
                curveTo(16.367f, 14.093f, 16.426f, 14.046f, 16.5f, 13.991f)
                curveTo(16.648f, 13.882f, 16.859f, 13.738f, 17.119f, 13.594f)
                curveTo(17.632f, 13.31f, 18.385f, 13.0f, 19.25f, 13.0f)
                curveTo(20.926f, 13.0f, 22.5f, 14.177f, 22.5f, 15.875f)
                curveTo(22.5f, 16.77f, 21.981f, 17.501f, 21.341f, 17.979f)
                lineTo(21.313f, 18.0f)
                lineTo(21.341f, 18.021f)
                curveTo(21.981f, 18.499f, 22.5f, 19.23f, 22.5f, 20.125f)
                curveTo(22.5f, 21.823f, 20.926f, 23.0f, 19.25f, 23.0f)
                curveTo(18.385f, 23.0f, 17.632f, 22.69f, 17.119f, 22.406f)
                curveTo(16.859f, 22.262f, 16.648f, 22.118f, 16.5f, 22.009f)
                curveTo(16.426f, 21.954f, 16.367f, 21.907f, 16.325f, 21.873f)
                curveTo(16.304f, 21.855f, 16.287f, 21.841f, 16.274f, 21.83f)
                lineTo(16.259f, 21.817f)
                lineTo(16.254f, 21.812f)
                lineTo(16.252f, 21.811f)
                lineTo(16.25f, 21.809f)
                curveTo(15.941f, 21.533f, 15.915f, 21.059f, 16.191f, 20.75f)
                curveTo(16.466f, 20.442f, 16.939f, 20.415f, 17.248f, 20.689f)
                lineTo(17.249f, 20.69f)
                lineTo(17.251f, 20.692f)
                curveTo(17.255f, 20.695f, 17.261f, 20.701f, 17.271f, 20.708f)
                curveTo(17.272f, 20.71f, 17.274f, 20.712f, 17.277f, 20.713f)
                curveTo(17.301f, 20.733f, 17.341f, 20.765f, 17.393f, 20.804f)
                curveTo(17.498f, 20.882f, 17.653f, 20.988f, 17.845f, 21.094f)
                curveTo(18.237f, 21.31f, 18.734f, 21.5f, 19.25f, 21.5f)
                curveTo(20.335f, 21.5f, 21.0f, 20.775f, 21.0f, 20.125f)
                curveTo(21.0f, 19.846f, 20.835f, 19.515f, 20.444f, 19.223f)
                curveTo(20.058f, 18.935f, 19.528f, 18.75f, 19.0f, 18.75f)
                curveTo(18.586f, 18.75f, 18.25f, 18.414f, 18.25f, 18.0f)
                close()
            }
        }
        .build()
        return _timer3!!
    }

@Suppress("ObjectPropertyName")
private var _timer3: ImageVector? = null

@Preview
@Composable
private fun Timer3Preview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.Timer3, contentDescription = null)
    }
}

