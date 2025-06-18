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

public val FluentIcons.Regular.PersonLink: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.PersonLink",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(16.754f, 13.999f)
            curveTo(17.535f, 13.999f, 18.222f, 14.397f, 18.626f, 15f)
            horizontalLineTo(15.754f)
            curveTo(14.991f, 15f, 14.271f, 15.18f, 13.632f, 15.499f)
            horizontalLineTo(5.253f)
            curveTo(4.839f, 15.499f, 4.504f, 15.835f, 4.504f, 16.248f)
            verticalLineTo(16.826f)
            curveTo(4.504f, 17.361f, 4.695f, 17.879f, 5.043f, 18.287f)
            curveTo(6.296f, 19.755f, 8.262f, 20.5f, 11f, 20.5f)
            lineTo(11.063f, 20.5f)
            curveTo(11.147f, 21.031f, 11.319f, 21.533f, 11.564f, 21.99f)
            curveTo(11.379f, 21.997f, 11.191f, 22f, 11f, 22f)
            curveTo(7.854f, 22f, 5.468f, 21.095f, 3.902f, 19.261f)
            curveTo(3.322f, 18.582f, 3.004f, 17.719f, 3.004f, 16.826f)
            verticalLineTo(16.248f)
            curveTo(3.004f, 15.006f, 4.011f, 13.999f, 5.253f, 13.999f)
            horizontalLineTo(16.754f)
            close()
            moveTo(11f, 2.004f)
            curveTo(13.762f, 2.004f, 16f, 4.242f, 16f, 7.004f)
            curveTo(16f, 9.765f, 13.762f, 12.004f, 11f, 12.004f)
            curveTo(8.239f, 12.004f, 6f, 9.765f, 6f, 7.004f)
            curveTo(6f, 4.242f, 8.239f, 2.004f, 11f, 2.004f)
            close()
            moveTo(11f, 3.504f)
            curveTo(9.067f, 3.504f, 7.5f, 5.071f, 7.5f, 7.004f)
            curveTo(7.5f, 8.937f, 9.067f, 10.504f, 11f, 10.504f)
            curveTo(12.933f, 10.504f, 14.5f, 8.937f, 14.5f, 7.004f)
            curveTo(14.5f, 5.071f, 12.933f, 3.504f, 11f, 3.504f)
            close()
            moveTo(23f, 19.75f)
            curveTo(23f, 17.679f, 21.321f, 16f, 19.25f, 16f)
            lineTo(19.148f, 16.007f)
            curveTo(18.782f, 16.056f, 18.5f, 16.37f, 18.5f, 16.75f)
            curveTo(18.5f, 17.164f, 18.836f, 17.5f, 19.25f, 17.5f)
            lineTo(19.404f, 17.505f)
            curveTo(20.575f, 17.584f, 21.5f, 18.559f, 21.5f, 19.75f)
            curveTo(21.5f, 20.993f, 20.493f, 22f, 19.25f, 22f)
            lineTo(19.247f, 22.005f)
            lineTo(19.145f, 22.012f)
            curveTo(18.779f, 22.063f, 18.498f, 22.378f, 18.5f, 22.758f)
            curveTo(18.502f, 23.172f, 18.839f, 23.507f, 19.253f, 23.505f)
            verticalLineTo(23.5f)
            lineTo(19.452f, 23.495f)
            curveTo(21.428f, 23.391f, 23f, 21.754f, 23f, 19.75f)
            close()
            moveTo(16.5f, 16.75f)
            curveTo(16.5f, 16.336f, 16.164f, 16f, 15.75f, 16f)
            lineTo(15.551f, 16.005f)
            curveTo(13.572f, 16.109f, 12f, 17.746f, 12f, 19.75f)
            curveTo(12f, 21.821f, 13.679f, 23.5f, 15.75f, 23.5f)
            lineTo(15.852f, 23.493f)
            curveTo(16.218f, 23.444f, 16.5f, 23.13f, 16.5f, 22.75f)
            curveTo(16.5f, 22.336f, 16.164f, 22f, 15.75f, 22f)
            lineTo(15.596f, 21.995f)
            curveTo(14.425f, 21.916f, 13.5f, 20.941f, 13.5f, 19.75f)
            curveTo(13.5f, 18.507f, 14.507f, 17.5f, 15.75f, 17.5f)
            lineTo(15.852f, 17.493f)
            curveTo(16.218f, 17.444f, 16.5f, 17.13f, 16.5f, 16.75f)
            close()
            moveTo(20f, 19.75f)
            curveTo(20f, 19.336f, 19.664f, 19f, 19.25f, 19f)
            horizontalLineTo(15.75f)
            lineTo(15.648f, 19.007f)
            curveTo(15.282f, 19.056f, 15f, 19.37f, 15f, 19.75f)
            curveTo(15f, 20.164f, 15.336f, 20.5f, 15.75f, 20.5f)
            horizontalLineTo(19.25f)
            lineTo(19.352f, 20.493f)
            curveTo(19.718f, 20.444f, 20f, 20.13f, 20f, 19.75f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun PersonLinkPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.PersonLink, contentDescription = null)
    }
}
