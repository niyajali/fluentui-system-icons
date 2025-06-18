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
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentIcons
import org.jetbrains.compose.ui.tooling.preview.Preview

public val FluentIcons.Regular.MusicNoteOff1: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.MusicNoteOff1",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(12f, 13.061f)
            lineTo(20.719f, 21.781f)
            curveTo(21.012f, 22.073f, 21.487f, 22.073f, 21.78f, 21.781f)
            curveTo(22.073f, 21.488f, 22.073f, 21.013f, 21.78f, 20.72f)
            lineTo(3.28f, 2.22f)
            curveTo(2.987f, 1.927f, 2.513f, 1.927f, 2.22f, 2.22f)
            curveTo(1.927f, 2.513f, 1.927f, 2.987f, 2.22f, 3.28f)
            lineTo(10.5f, 11.561f)
            verticalLineTo(14.877f)
            curveTo(9.815f, 14.328f, 8.946f, 14f, 8f, 14f)
            curveTo(5.791f, 14f, 4f, 15.791f, 4f, 18f)
            curveTo(4f, 20.209f, 5.791f, 22f, 8f, 22f)
            curveTo(10.061f, 22f, 11.758f, 20.441f, 11.976f, 18.438f)
            curveTo(11.992f, 18.378f, 12f, 18.315f, 12f, 18.25f)
            verticalLineTo(13.061f)
            close()
            moveTo(10.5f, 18f)
            curveTo(10.5f, 19.381f, 9.381f, 20.5f, 8f, 20.5f)
            curveTo(6.619f, 20.5f, 5.5f, 19.381f, 5.5f, 18f)
            curveTo(5.5f, 16.619f, 6.619f, 15.5f, 8f, 15.5f)
            curveTo(9.381f, 15.5f, 10.5f, 16.619f, 10.5f, 18f)
            close()
            moveTo(18.987f, 11.452f)
            lineTo(12.023f, 8.841f)
            lineTo(10.5f, 7.318f)
            verticalLineTo(2.75f)
            curveTo(10.5f, 2.504f, 10.621f, 2.274f, 10.823f, 2.134f)
            curveTo(11.025f, 1.993f, 11.283f, 1.961f, 11.513f, 2.048f)
            lineTo(17.891f, 4.439f)
            curveTo(19.16f, 4.915f, 20f, 6.128f, 20f, 7.483f)
            verticalLineTo(10.75f)
            curveTo(20f, 10.996f, 19.879f, 11.226f, 19.677f, 11.366f)
            curveTo(19.475f, 11.507f, 19.217f, 11.539f, 18.987f, 11.452f)
            close()
            moveTo(18.5f, 9.668f)
            verticalLineTo(7.483f)
            curveTo(18.5f, 6.753f, 18.048f, 6.1f, 17.365f, 5.844f)
            lineTo(12f, 3.832f)
            verticalLineTo(7.23f)
            lineTo(18.5f, 9.668f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun MusicNoteOff1Preview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.MusicNoteOff1, contentDescription = null)
    }
}
