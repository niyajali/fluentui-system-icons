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

public val FluentUi.Filled.TextChangeCase: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.TextChangeCase",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(16.514f, 2.75f)
            curveTo(16.932f, 2.756f, 17.303f, 3.022f, 17.442f, 3.416f)
            lineTo(22.942f, 18.916f)
            curveTo(23.127f, 19.436f, 22.855f, 20.008f, 22.334f, 20.192f)
            curveTo(21.814f, 20.377f, 21.242f, 20.105f, 21.058f, 19.584f)
            lineTo(19.786f, 16f)
            lineTo(12.83f, 16f)
            lineTo(11.433f, 19.611f)
            curveTo(11.233f, 20.126f, 10.654f, 20.382f, 10.139f, 20.183f)
            curveTo(9.624f, 19.983f, 9.368f, 19.404f, 9.567f, 18.889f)
            lineTo(15.568f, 3.389f)
            curveTo(15.718f, 2.999f, 16.096f, 2.744f, 16.514f, 2.75f)
            close()
            moveTo(16.459f, 6.625f)
            lineTo(13.605f, 14f)
            lineTo(19.076f, 14f)
            lineTo(16.459f, 6.625f)
            close()
            moveTo(8.25f, 20.26f)
            curveTo(7.799f, 20.26f, 7.419f, 19.962f, 7.294f, 19.553f)
            curveTo(6.403f, 20.016f, 5.556f, 20.26f, 4.75f, 20.26f)
            curveTo(2.78f, 20.26f, 1.25f, 18.86f, 1.25f, 16.76f)
            curveTo(1.25f, 15.838f, 1.569f, 15.023f, 2.16f, 14.408f)
            curveTo(2.75f, 13.794f, 3.597f, 13.393f, 4.63f, 13.268f)
            curveTo(5.486f, 13.164f, 6.353f, 13.21f, 7.226f, 13.403f)
            curveTo(7.18f, 13.065f, 7.064f, 12.824f, 6.889f, 12.655f)
            curveTo(6.659f, 12.431f, 6.285f, 12.288f, 5.7f, 12.259f)
            curveTo(4.754f, 12.212f, 4.148f, 12.35f, 3.822f, 12.579f)
            curveTo(3.37f, 12.896f, 2.746f, 12.787f, 2.429f, 12.335f)
            curveTo(2.112f, 11.882f, 2.221f, 11.259f, 2.674f, 10.942f)
            curveTo(3.391f, 10.438f, 4.347f, 10.23f, 5.505f, 10.252f)
            lineTo(5.509f, 10.252f)
            lineTo(5.8f, 10.262f)
            curveTo(6.825f, 10.313f, 7.669f, 10.635f, 8.269f, 11.207f)
            curveTo(8.87f, 11.781f, 9.202f, 12.583f, 9.245f, 13.544f)
            lineTo(9.245f, 13.55f)
            lineTo(9.25f, 13.76f)
            verticalLineTo(19.26f)
            curveTo(9.25f, 19.767f, 8.874f, 20.185f, 8.385f, 20.251f)
            lineTo(8.377f, 20.252f)
            lineTo(8.258f, 20.26f)
            horizontalLineTo(8.25f)
            close()
            moveTo(4.87f, 15.29f)
            curveTo(4.291f, 15.36f, 3.889f, 15.545f, 3.633f, 15.797f)
            curveTo(3.382f, 16.044f, 3.25f, 16.378f, 3.25f, 16.797f)
            curveTo(3.25f, 17.289f, 3.409f, 17.658f, 3.661f, 17.904f)
            curveTo(3.913f, 18.151f, 4.284f, 18.297f, 4.75f, 18.297f)
            curveTo(5.359f, 18.297f, 6.147f, 18.013f, 7.112f, 17.375f)
            lineTo(7.249f, 17.282f)
            verticalLineTo(15.51f)
            lineTo(7.127f, 15.474f)
            curveTo(6.35f, 15.261f, 5.599f, 15.201f, 4.87f, 15.29f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun TextChangeCasePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.TextChangeCase, contentDescription = null)
    }
}
