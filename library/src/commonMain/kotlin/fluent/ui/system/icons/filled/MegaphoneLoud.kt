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

public val FluentUi.Filled.MegaphoneLoud: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.MegaphoneLoud",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(17.212f, 2.237f)
            curveTo(17.343f, 1.845f, 17.13f, 1.42f, 16.737f, 1.289f)
            curveTo(16.344f, 1.158f, 15.92f, 1.37f, 15.789f, 1.763f)
            lineTo(15.039f, 4.012f)
            curveTo(14.908f, 4.405f, 15.12f, 4.83f, 15.513f, 4.961f)
            curveTo(15.906f, 5.092f, 16.331f, 4.879f, 16.462f, 4.486f)
            lineTo(17.212f, 2.237f)
            close()
            moveTo(21.78f, 2.22f)
            curveTo(22.073f, 2.513f, 22.073f, 2.988f, 21.78f, 3.281f)
            lineTo(19.28f, 5.781f)
            curveTo(18.987f, 6.073f, 18.513f, 6.073f, 18.22f, 5.781f)
            curveTo(17.927f, 5.488f, 17.927f, 5.013f, 18.22f, 4.72f)
            lineTo(20.72f, 2.22f)
            curveTo(21.013f, 1.927f, 21.487f, 1.927f, 21.78f, 2.22f)
            close()
            moveTo(12.871f, 3.741f)
            curveTo(11.755f, 2.546f, 9.786f, 2.845f, 9.076f, 4.318f)
            lineTo(3.178f, 16.559f)
            curveTo(2.838f, 17.266f, 2.994f, 18.112f, 3.565f, 18.65f)
            lineTo(5.004f, 20.007f)
            curveTo(5.531f, 20.504f, 6.305f, 20.636f, 6.968f, 20.343f)
            lineTo(8.385f, 19.715f)
            curveTo(9.028f, 21.066f, 10.405f, 22f, 12f, 22f)
            curveTo(14.21f, 22f, 16f, 20.209f, 16f, 18f)
            curveTo(16f, 17.46f, 15.893f, 16.945f, 15.699f, 16.475f)
            lineTo(19.119f, 14.959f)
            curveTo(20.581f, 14.312f, 20.968f, 12.416f, 19.877f, 11.247f)
            lineTo(12.871f, 3.741f)
            close()
            moveTo(14.327f, 17.083f)
            curveTo(14.439f, 17.367f, 14.5f, 17.676f, 14.5f, 18f)
            curveTo(14.5f, 19.381f, 13.381f, 20.5f, 12f, 20.5f)
            curveTo(11.017f, 20.5f, 10.166f, 19.932f, 9.758f, 19.107f)
            lineTo(14.327f, 17.083f)
            close()
            moveTo(19f, 8.249f)
            curveTo(19f, 7.835f, 19.336f, 7.499f, 19.75f, 7.499f)
            horizontalLineTo(21.75f)
            curveTo(22.164f, 7.499f, 22.5f, 7.835f, 22.5f, 8.249f)
            curveTo(22.5f, 8.664f, 22.164f, 8.999f, 21.75f, 8.999f)
            horizontalLineTo(19.75f)
            curveTo(19.336f, 8.999f, 19f, 8.664f, 19f, 8.249f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun MegaphoneLoudPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.MegaphoneLoud, contentDescription = null)
    }
}
