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
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentUi
import org.jetbrains.compose.ui.tooling.preview.Preview

public val FluentUi.Filled.Snooze: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Snooze",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(9f, 12.504f)
            curveTo(9.8f, 12.504f, 10.262f, 13.388f, 9.846f, 14.038f)
            lineTo(9.781f, 14.129f)
            lineTo(5.081f, 19.999f)
            lineTo(9f, 20f)
            curveTo(9.513f, 20f, 9.935f, 20.386f, 9.993f, 20.883f)
            lineTo(10f, 21f)
            curveTo(10f, 21.513f, 9.614f, 21.935f, 9.117f, 21.993f)
            lineTo(9f, 22f)
            horizontalLineTo(3f)
            curveTo(2.199f, 22f, 1.738f, 21.116f, 2.154f, 20.466f)
            lineTo(2.219f, 20.375f)
            lineTo(6.918f, 14.504f)
            lineTo(3.001f, 14.504f)
            curveTo(2.488f, 14.504f, 2.065f, 14.118f, 2.008f, 13.621f)
            lineTo(2.001f, 13.504f)
            curveTo(2.001f, 12.991f, 2.387f, 12.569f, 2.884f, 12.511f)
            lineTo(3.001f, 12.504f)
            horizontalLineTo(9f)
            close()
            moveTo(21f, 2f)
            curveTo(21.805f, 2f, 22.265f, 2.893f, 21.841f, 3.542f)
            lineTo(21.774f, 3.633f)
            lineTo(14.109f, 13f)
            horizontalLineTo(21f)
            curveTo(21.513f, 13f, 21.935f, 13.386f, 21.993f, 13.883f)
            lineTo(22f, 14f)
            curveTo(22f, 14.513f, 21.614f, 14.936f, 21.117f, 14.993f)
            lineTo(21f, 15f)
            horizontalLineTo(12f)
            curveTo(11.195f, 15f, 10.735f, 14.107f, 11.159f, 13.458f)
            lineTo(11.226f, 13.367f)
            lineTo(18.889f, 4f)
            horizontalLineTo(12f)
            curveTo(11.487f, 4f, 11.064f, 3.614f, 11.007f, 3.117f)
            lineTo(11f, 3f)
            curveTo(11f, 2.487f, 11.386f, 2.064f, 11.883f, 2.007f)
            lineTo(12f, 2f)
            horizontalLineTo(21f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun SnoozePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.Snooze, contentDescription = null)
    }
}
