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
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import org.jetbrains.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentIcons

public val FluentIcons.Filled.CallCheckmark: ImageVector
    get() {
        if (_CallCheckmark != null) {
            return _CallCheckmark!!
        }
        _CallCheckmark = ImageVector.Builder(
            name = "Filled.CallCheckmark",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(21.781f, 3.28f)
                curveTo(22.074f, 2.987f, 22.074f, 2.513f, 21.781f, 2.22f)
                curveTo(21.488f, 1.927f, 21.013f, 1.927f, 20.72f, 2.22f)
                lineTo(15f, 7.939f)
                lineTo(13.131f, 6.07f)
                curveTo(12.838f, 5.777f, 12.363f, 5.777f, 12.07f, 6.07f)
                curveTo(11.777f, 6.363f, 11.777f, 6.837f, 12.07f, 7.13f)
                lineTo(14.47f, 9.53f)
                curveTo(14.611f, 9.671f, 14.802f, 9.75f, 15f, 9.75f)
                curveTo(15.199f, 9.75f, 15.39f, 9.671f, 15.531f, 9.53f)
                lineTo(21.781f, 3.28f)
                close()
                moveTo(6.849f, 2.095f)
                lineTo(5.772f, 2.439f)
                curveTo(4.705f, 2.78f, 3.887f, 3.695f, 3.623f, 4.843f)
                curveTo(2.996f, 7.572f, 3.748f, 10.895f, 5.881f, 14.811f)
                curveTo(8.011f, 18.721f, 10.345f, 21.073f, 12.884f, 21.865f)
                curveTo(13.96f, 22.2f, 15.122f, 21.904f, 15.936f, 21.087f)
                lineTo(16.754f, 20.265f)
                curveTo(17.517f, 19.5f, 17.628f, 18.253f, 17.013f, 17.35f)
                lineTo(15.78f, 15.539f)
                curveTo(15.251f, 14.762f, 14.312f, 14.432f, 13.45f, 14.719f)
                lineTo(11.174f, 15.478f)
                curveTo(10.267f, 14.791f, 9.509f, 13.926f, 8.903f, 12.883f)
                curveTo(8.297f, 11.841f, 7.936f, 10.782f, 7.819f, 9.706f)
                lineTo(9.713f, 7.908f)
                curveTo(10.394f, 7.262f, 10.602f, 6.223f, 10.227f, 5.34f)
                lineTo(9.367f, 3.313f)
                curveTo(8.935f, 2.294f, 7.858f, 1.773f, 6.849f, 2.095f)
                close()
            }
        }.build()

        return _CallCheckmark!!
    }

@Suppress("ObjectPropertyName")
private var _CallCheckmark: ImageVector? = null

@Preview
@Composable
private fun CallCheckmarkPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.CallCheckmark, contentDescription = null)
    }
}
