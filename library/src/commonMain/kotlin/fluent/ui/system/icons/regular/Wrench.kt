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
 * Wrench icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: wrench
 * - Source: ic_fluent_wrench_24_regular.svg
 * 
 * @return The [ImageVector] for the Wrench icon.
 */
public val FluentIcons.Regular.Wrench: ImageVector
    get() {
        if (_wrench != null) {
            return _wrench!!
        }
        _wrench = Builder(name = "Wrench", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(11.0f, 7.5f)
                curveTo(11.0f, 4.462f, 13.463f, 2.0f, 16.5f, 2.0f)
                curveTo(17.267f, 2.0f, 17.999f, 2.157f, 18.664f, 2.442f)
                curveTo(18.893f, 2.54f, 19.058f, 2.745f, 19.105f, 2.99f)
                curveTo(19.152f, 3.234f, 19.075f, 3.486f, 18.899f, 3.662f)
                lineTo(16.311f, 6.25f)
                lineTo(17.75f, 7.689f)
                lineTo(20.338f, 5.101f)
                curveTo(20.514f, 4.925f, 20.766f, 4.848f, 21.011f, 4.895f)
                curveTo(21.255f, 4.942f, 21.46f, 5.108f, 21.558f, 5.337f)
                curveTo(21.843f, 6.002f, 22.0f, 6.733f, 22.0f, 7.5f)
                curveTo(22.0f, 10.538f, 19.538f, 13.0f, 16.5f, 13.0f)
                curveTo(16.058f, 13.0f, 15.627f, 12.948f, 15.214f, 12.849f)
                lineTo(6.902f, 21.161f)
                curveTo(5.78f, 22.282f, 3.962f, 22.282f, 2.841f, 21.161f)
                curveTo(1.72f, 20.04f, 1.72f, 18.222f, 2.841f, 17.1f)
                lineTo(11.152f, 8.789f)
                curveTo(11.053f, 8.375f, 11.0f, 7.943f, 11.0f, 7.5f)
                close()
                moveTo(16.5f, 3.5f)
                curveTo(14.291f, 3.5f, 12.5f, 5.291f, 12.5f, 7.5f)
                curveTo(12.5f, 7.945f, 12.573f, 8.372f, 12.706f, 8.77f)
                curveTo(12.796f, 9.039f, 12.726f, 9.337f, 12.525f, 9.538f)
                lineTo(3.902f, 18.161f)
                curveTo(3.366f, 18.697f, 3.366f, 19.565f, 3.902f, 20.1f)
                curveTo(4.437f, 20.636f, 5.305f, 20.636f, 5.841f, 20.1f)
                lineTo(14.465f, 11.476f)
                curveTo(14.666f, 11.275f, 14.963f, 11.205f, 15.233f, 11.295f)
                curveTo(15.63f, 11.428f, 16.056f, 11.5f, 16.5f, 11.5f)
                curveTo(18.709f, 11.5f, 20.5f, 9.709f, 20.5f, 7.5f)
                curveTo(20.5f, 7.359f, 20.493f, 7.22f, 20.479f, 7.082f)
                lineTo(18.634f, 8.927f)
                curveTo(18.146f, 9.415f, 17.355f, 9.415f, 16.867f, 8.927f)
                lineTo(15.074f, 7.134f)
                curveTo(14.585f, 6.646f, 14.585f, 5.854f, 15.074f, 5.366f)
                lineTo(16.918f, 3.522f)
                curveTo(16.781f, 3.507f, 16.642f, 3.5f, 16.5f, 3.5f)
                close()
            }
        }
        .build()
        return _wrench!!
    }

@Suppress("ObjectPropertyName")
private var _wrench: ImageVector? = null

@Preview
@Composable
private fun WrenchPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.Wrench, contentDescription = null)
    }
}

