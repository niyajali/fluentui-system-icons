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
import fluent.ui.system.icons.FluentUi
import org.jetbrains.compose.ui.tooling.preview.Preview

public val FluentUi.Regular.ContactCardGroup: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ContactCardGroup",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(18.75f, 4f)
            curveTo(20.545f, 4f, 22f, 5.455f, 22f, 7.25f)
            verticalLineTo(16.755f)
            curveTo(22f, 18.549f, 20.545f, 20.005f, 18.75f, 20.005f)
            horizontalLineTo(5.25f)
            curveTo(3.455f, 20.005f, 2f, 18.549f, 2f, 16.755f)
            verticalLineTo(7.25f)
            curveTo(2f, 5.517f, 3.356f, 4.101f, 5.066f, 4.005f)
            lineTo(5.25f, 4f)
            horizontalLineTo(18.75f)
            close()
            moveTo(18.75f, 5.5f)
            horizontalLineTo(5.25f)
            lineTo(5.106f, 5.506f)
            curveTo(4.207f, 5.579f, 3.5f, 6.332f, 3.5f, 7.25f)
            verticalLineTo(16.755f)
            curveTo(3.5f, 17.721f, 4.284f, 18.505f, 5.25f, 18.505f)
            horizontalLineTo(18.75f)
            curveTo(19.716f, 18.505f, 20.5f, 17.721f, 20.5f, 16.755f)
            verticalLineTo(7.25f)
            curveTo(20.5f, 6.284f, 19.716f, 5.5f, 18.75f, 5.5f)
            close()
            moveTo(9.253f, 12.5f)
            curveTo(9.667f, 12.5f, 10.003f, 12.836f, 10.003f, 13.25f)
            verticalLineTo(13.832f)
            curveTo(10.003f, 15.104f, 9.034f, 15.75f, 7.501f, 15.75f)
            curveTo(5.968f, 15.75f, 5f, 15.104f, 5f, 13.831f)
            verticalLineTo(13.25f)
            curveTo(5f, 12.836f, 5.336f, 12.5f, 5.75f, 12.5f)
            horizontalLineTo(9.253f)
            close()
            moveTo(10.833f, 12.499f)
            lineTo(12.25f, 12.5f)
            curveTo(12.664f, 12.5f, 13f, 12.836f, 13f, 13.25f)
            verticalLineTo(13.583f)
            curveTo(13f, 14.546f, 12.235f, 15f, 11.125f, 15f)
            curveTo(11.009f, 15f, 10.896f, 14.995f, 10.788f, 14.985f)
            curveTo(10.9f, 14.716f, 10.97f, 14.416f, 10.994f, 14.086f)
            lineTo(11.003f, 13.832f)
            verticalLineTo(13.25f)
            curveTo(11.003f, 12.981f, 10.942f, 12.726f, 10.833f, 12.499f)
            close()
            moveTo(15.25f, 12.5f)
            horizontalLineTo(18.25f)
            curveTo(18.664f, 12.5f, 19f, 12.836f, 19f, 13.25f)
            curveTo(19f, 13.63f, 18.718f, 13.943f, 18.352f, 13.993f)
            lineTo(18.25f, 14f)
            horizontalLineTo(15.25f)
            curveTo(14.835f, 14f, 14.5f, 13.664f, 14.5f, 13.25f)
            curveTo(14.5f, 12.87f, 14.782f, 12.557f, 15.148f, 12.507f)
            lineTo(15.25f, 12.5f)
            horizontalLineTo(18.25f)
            horizontalLineTo(15.25f)
            close()
            moveTo(7.501f, 8.5f)
            curveTo(8.33f, 8.5f, 9.001f, 9.172f, 9.001f, 10.001f)
            curveTo(9.001f, 10.83f, 8.33f, 11.501f, 7.501f, 11.501f)
            curveTo(6.672f, 11.501f, 6f, 10.83f, 6f, 10.001f)
            curveTo(6f, 9.172f, 6.672f, 8.5f, 7.501f, 8.5f)
            close()
            moveTo(11.37f, 9.002f)
            curveTo(12.059f, 9.002f, 12.618f, 9.561f, 12.618f, 10.25f)
            curveTo(12.618f, 10.939f, 12.059f, 11.498f, 11.37f, 11.498f)
            curveTo(10.681f, 11.498f, 10.122f, 10.939f, 10.122f, 10.25f)
            curveTo(10.122f, 9.561f, 10.681f, 9.002f, 11.37f, 9.002f)
            close()
            moveTo(15.25f, 9.5f)
            horizontalLineTo(18.25f)
            curveTo(18.664f, 9.5f, 19f, 9.836f, 19f, 10.25f)
            curveTo(19f, 10.63f, 18.718f, 10.943f, 18.352f, 10.993f)
            lineTo(18.25f, 11f)
            horizontalLineTo(15.25f)
            curveTo(14.835f, 11f, 14.5f, 10.664f, 14.5f, 10.25f)
            curveTo(14.5f, 9.87f, 14.782f, 9.557f, 15.148f, 9.507f)
            lineTo(15.25f, 9.5f)
            horizontalLineTo(18.25f)
            horizontalLineTo(15.25f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ContactCardGroupPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.ContactCardGroup, contentDescription = null)
    }
}
