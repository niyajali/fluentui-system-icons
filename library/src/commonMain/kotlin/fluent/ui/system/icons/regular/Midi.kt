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

public val FluentUi.Regular.Midi: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Midi",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(21.25f, 4.002f)
            curveTo(21.63f, 4.002f, 21.944f, 4.284f, 21.993f, 4.65f)
            lineTo(22f, 4.752f)
            verticalLineTo(19.252f)
            curveTo(22f, 19.632f, 21.718f, 19.945f, 21.352f, 19.995f)
            lineTo(21.25f, 20.002f)
            horizontalLineTo(2.75f)
            curveTo(2.37f, 20.002f, 2.057f, 19.72f, 2.007f, 19.354f)
            lineTo(2f, 19.252f)
            verticalLineTo(4.752f)
            curveTo(2f, 4.372f, 2.282f, 4.058f, 2.648f, 4.009f)
            lineTo(2.75f, 4.002f)
            horizontalLineTo(21.25f)
            close()
            moveTo(6f, 12.501f)
            horizontalLineTo(3.5f)
            verticalLineTo(18.502f)
            horizontalLineTo(20.5f)
            verticalLineTo(12.501f)
            horizontalLineTo(18f)
            verticalLineTo(16.25f)
            curveTo(18f, 16.664f, 17.664f, 17f, 17.25f, 17f)
            curveTo(16.87f, 17f, 16.556f, 16.718f, 16.507f, 16.352f)
            lineTo(16.5f, 16.25f)
            verticalLineTo(12.501f)
            horizontalLineTo(14.5f)
            verticalLineTo(16.25f)
            curveTo(14.5f, 16.664f, 14.164f, 17f, 13.75f, 17f)
            curveTo(13.37f, 17f, 13.057f, 16.718f, 13.007f, 16.352f)
            lineTo(13f, 16.25f)
            verticalLineTo(12.501f)
            horizontalLineTo(11f)
            verticalLineTo(16.25f)
            curveTo(11f, 16.664f, 10.664f, 17f, 10.25f, 17f)
            curveTo(9.87f, 17f, 9.557f, 16.718f, 9.507f, 16.352f)
            lineTo(9.5f, 16.25f)
            verticalLineTo(12.501f)
            horizontalLineTo(7.5f)
            verticalLineTo(16.25f)
            curveTo(7.5f, 16.664f, 7.164f, 17f, 6.75f, 17f)
            curveTo(6.37f, 17f, 6.057f, 16.718f, 6.007f, 16.352f)
            lineTo(6f, 16.25f)
            verticalLineTo(12.501f)
            close()
            moveTo(20.5f, 5.502f)
            horizontalLineTo(3.5f)
            verticalLineTo(11.001f)
            horizontalLineTo(20.5f)
            verticalLineTo(5.502f)
            close()
            moveTo(9.25f, 7.502f)
            curveTo(9.664f, 7.502f, 10f, 7.838f, 10f, 8.252f)
            curveTo(10f, 8.666f, 9.664f, 9.002f, 9.25f, 9.002f)
            curveTo(8.836f, 9.002f, 8.5f, 8.666f, 8.5f, 8.252f)
            curveTo(8.5f, 7.838f, 8.836f, 7.502f, 9.25f, 7.502f)
            close()
            moveTo(17.25f, 7.501f)
            curveTo(17.664f, 7.501f, 18f, 7.837f, 18f, 8.251f)
            curveTo(18f, 8.631f, 17.718f, 8.944f, 17.352f, 8.994f)
            lineTo(17.25f, 9.001f)
            horizontalLineTo(14.75f)
            curveTo(14.336f, 9.001f, 14f, 8.665f, 14f, 8.251f)
            curveTo(14f, 7.871f, 14.282f, 7.557f, 14.648f, 7.508f)
            lineTo(14.75f, 7.501f)
            horizontalLineTo(17.25f)
            close()
            moveTo(6.25f, 7.5f)
            curveTo(6.664f, 7.5f, 7f, 7.836f, 7f, 8.25f)
            curveTo(7f, 8.664f, 6.664f, 9f, 6.25f, 9f)
            curveTo(5.836f, 9f, 5.5f, 8.664f, 5.5f, 8.25f)
            curveTo(5.5f, 7.836f, 5.836f, 7.5f, 6.25f, 7.5f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun MidiPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.Midi, contentDescription = null)
    }
}
