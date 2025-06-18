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
import fluent.ui.system.icons.FluentUi

public val FluentUi.Regular.EraserMedium: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.EraserMedium",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(15.841f, 2.661f)
            curveTo(14.968f, 1.771f, 13.537f, 1.76f, 12.651f, 2.638f)
            lineTo(3.052f, 12.146f)
            curveTo(2.161f, 13.03f, 2.164f, 14.471f, 3.059f, 15.35f)
            lineTo(8.158f, 20.358f)
            curveTo(9.042f, 21.226f, 10.462f, 21.216f, 11.334f, 20.335f)
            lineTo(11.549f, 20.118f)
            curveTo(11.321f, 19.6f, 11.158f, 19.046f, 11.071f, 18.468f)
            lineTo(10.268f, 19.28f)
            curveTo(9.977f, 19.573f, 9.504f, 19.577f, 9.209f, 19.288f)
            lineTo(4.11f, 14.28f)
            curveTo(3.812f, 13.987f, 3.811f, 13.506f, 4.108f, 13.212f)
            lineTo(5.637f, 11.697f)
            lineTo(11.014f, 17.074f)
            curveTo(11.053f, 16.461f, 11.178f, 15.87f, 11.376f, 15.315f)
            lineTo(6.703f, 10.642f)
            lineTo(13.706f, 3.704f)
            curveTo(14.002f, 3.411f, 14.479f, 3.414f, 14.77f, 3.711f)
            lineTo(19.68f, 8.72f)
            curveTo(19.967f, 9.012f, 19.965f, 9.481f, 19.677f, 9.772f)
            lineTo(18.401f, 11.061f)
            curveTo(18.981f, 11.142f, 19.536f, 11.299f, 20.056f, 11.522f)
            lineTo(20.743f, 10.827f)
            curveTo(21.608f, 9.953f, 21.611f, 8.547f, 20.751f, 7.669f)
            lineTo(15.841f, 2.661f)
            close()
        }
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(19.289f, 12.297f)
            curveTo(21.448f, 13.04f, 23f, 15.088f, 23f, 17.5f)
            curveTo(23f, 20.537f, 20.537f, 23f, 17.5f, 23f)
            curveTo(15.109f, 23f, 13.074f, 21.474f, 12.316f, 19.343f)
            curveTo(12.111f, 18.767f, 12f, 18.146f, 12f, 17.5f)
            curveTo(12f, 17.021f, 12.061f, 16.557f, 12.176f, 16.115f)
            curveTo(12.787f, 13.756f, 14.925f, 12.012f, 17.473f, 12f)
        }
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(17.5f, 12f)
            curveTo(18.126f, 12f, 18.728f, 12.104f, 19.289f, 12.297f)
            close()
        }
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(17.5f, 12f)
            curveTo(17.491f, 12f, 17.482f, 12f, 17.473f, 12f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun EraserMediumPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.EraserMedium, contentDescription = null)
    }
}
