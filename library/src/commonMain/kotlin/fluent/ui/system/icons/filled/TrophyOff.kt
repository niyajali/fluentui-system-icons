/**
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

import org.jetbrains.compose.ui.tooling.preview.Preview
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
import fluent.ui.system.icons.FluentUi

public val FluentUi.Filled.TrophyOff: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.TrophyOff",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(3.481f, 4.541f)
            lineTo(2.22f, 3.28f)
            curveTo(1.927f, 2.987f, 1.927f, 2.513f, 2.22f, 2.22f)
            curveTo(2.513f, 1.927f, 2.987f, 1.927f, 3.28f, 2.22f)
            lineTo(21.78f, 20.72f)
            curveTo(22.073f, 21.013f, 22.073f, 21.488f, 21.78f, 21.781f)
            curveTo(21.487f, 22.073f, 21.012f, 22.073f, 20.719f, 21.781f)
            lineTo(14.33f, 15.391f)
            curveTo(13.767f, 15.674f, 13.151f, 15.867f, 12.501f, 15.952f)
            lineTo(12.5f, 17.5f)
            horizontalLineTo(14.254f)
            curveTo(15.987f, 17.5f, 17.403f, 18.857f, 17.498f, 20.566f)
            lineTo(17.504f, 20.75f)
            verticalLineTo(21.25f)
            curveTo(17.504f, 21.63f, 17.221f, 21.944f, 16.855f, 21.993f)
            lineTo(16.754f, 22f)
            horizontalLineTo(6.751f)
            curveTo(6.371f, 22f, 6.057f, 21.718f, 6.007f, 21.352f)
            lineTo(6.001f, 21.25f)
            verticalLineTo(20.75f)
            curveTo(6.001f, 19.017f, 7.357f, 17.601f, 9.066f, 17.505f)
            lineTo(9.251f, 17.5f)
            horizontalLineTo(11f)
            lineTo(11f, 15.951f)
            curveTo(8.769f, 15.66f, 6.94f, 14.09f, 6.272f, 12.001f)
            lineTo(6.246f, 12f)
            curveTo(4.451f, 12f, 2.996f, 10.545f, 2.996f, 8.75f)
            verticalLineTo(5.75f)
            curveTo(2.996f, 5.281f, 3.18f, 4.855f, 3.481f, 4.541f)
            close()
            moveTo(6.001f, 7.061f)
            lineTo(4.543f, 5.604f)
            curveTo(4.514f, 5.645f, 4.496f, 5.695f, 4.496f, 5.75f)
            verticalLineTo(8.75f)
            curveTo(4.496f, 9.633f, 5.15f, 10.363f, 6.001f, 10.483f)
            verticalLineTo(7.061f)
            close()
            moveTo(17.232f, 12.001f)
            curveTo(17.073f, 12.496f, 16.85f, 12.962f, 16.571f, 13.389f)
            lineTo(6.304f, 3.122f)
            curveTo(6.693f, 2.451f, 7.419f, 2f, 8.251f, 2f)
            horizontalLineTo(15.254f)
            curveTo(16.412f, 2f, 17.366f, 2.875f, 17.49f, 4f)
            lineTo(18.758f, 4f)
            curveTo(19.676f, 4f, 20.429f, 4.707f, 20.502f, 5.606f)
            lineTo(20.508f, 5.75f)
            verticalLineTo(8.75f)
            curveTo(20.508f, 10.483f, 19.151f, 11.899f, 17.442f, 11.995f)
            lineTo(17.232f, 12.001f)
            close()
            moveTo(18.758f, 5.5f)
            horizontalLineTo(17.504f)
            verticalLineTo(10.483f)
            curveTo(18.304f, 10.37f, 18.93f, 9.717f, 19.001f, 8.904f)
            lineTo(19.008f, 8.75f)
            verticalLineTo(5.75f)
            curveTo(19.008f, 5.632f, 18.925f, 5.533f, 18.815f, 5.507f)
            lineTo(18.758f, 5.5f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun TrophyOffPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.TrophyOff, contentDescription = null)
    }
}
