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

public val FluentUi.Filled.ClipboardLetter: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ClipboardLetter",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(10.25f, 3.5f)
            horizontalLineTo(13.75f)
            curveTo(14.164f, 3.5f, 14.5f, 3.836f, 14.5f, 4.25f)
            curveTo(14.5f, 4.664f, 14.164f, 5f, 13.75f, 5f)
            horizontalLineTo(10.25f)
            curveTo(9.836f, 5f, 9.5f, 4.664f, 9.5f, 4.25f)
            curveTo(9.5f, 3.836f, 9.836f, 3.5f, 10.25f, 3.5f)
            close()
            moveTo(13.75f, 2f)
            horizontalLineTo(10.25f)
            curveTo(9.092f, 2f, 8.138f, 2.875f, 8.014f, 3.999f)
            lineTo(6.25f, 4f)
            curveTo(5.007f, 4f, 4f, 5.007f, 4f, 6.25f)
            verticalLineTo(19.75f)
            curveTo(4f, 20.993f, 5.007f, 22f, 6.25f, 22f)
            horizontalLineTo(11.169f)
            curveTo(10.957f, 21.554f, 10.935f, 21.021f, 11.153f, 20.535f)
            lineTo(12.702f, 17.072f)
            curveTo(12.712f, 17.048f, 12.723f, 17.024f, 12.734f, 17.001f)
            lineTo(15.403f, 11.035f)
            curveTo(15.684f, 10.406f, 16.31f, 10f, 17f, 10f)
            curveTo(17.69f, 10f, 18.316f, 10.406f, 18.597f, 11.035f)
            lineTo(20f, 14.17f)
            verticalLineTo(6.25f)
            curveTo(20f, 5.007f, 18.993f, 4f, 17.75f, 4f)
            lineTo(15.986f, 3.999f)
            curveTo(15.862f, 2.875f, 14.908f, 2f, 13.75f, 2f)
            close()
            moveTo(17.685f, 11.444f)
            curveTo(17.564f, 11.174f, 17.296f, 11f, 17f, 11f)
            curveTo(16.704f, 11f, 16.436f, 11.174f, 16.315f, 11.444f)
            lineTo(13.638f, 17.429f)
            curveTo(13.633f, 17.439f, 13.628f, 17.449f, 13.624f, 17.459f)
            lineTo(12.065f, 20.944f)
            curveTo(11.896f, 21.322f, 12.066f, 21.765f, 12.444f, 21.935f)
            curveTo(12.822f, 22.104f, 13.266f, 21.934f, 13.435f, 21.556f)
            lineTo(14.802f, 18.5f)
            horizontalLineTo(19.198f)
            lineTo(20.565f, 21.556f)
            curveTo(20.735f, 21.934f, 21.178f, 22.104f, 21.556f, 21.935f)
            curveTo(21.934f, 21.765f, 22.104f, 21.322f, 21.935f, 20.944f)
            lineTo(20.376f, 17.459f)
            curveTo(20.372f, 17.449f, 20.367f, 17.439f, 20.362f, 17.429f)
            lineTo(17.685f, 11.444f)
            close()
            moveTo(17f, 13.587f)
            lineTo(18.527f, 17f)
            horizontalLineTo(15.473f)
            lineTo(17f, 13.587f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ClipboardLetterPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.ClipboardLetter, contentDescription = null)
    }
}
