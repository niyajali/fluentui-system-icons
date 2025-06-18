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

public val FluentUi.Regular.MicPulse: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.MicPulse",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(11f, 17.5f)
            curveTo(11f, 18.596f, 11.271f, 19.629f, 11.75f, 20.535f)
            lineTo(11.75f, 21.25f)
            curveTo(11.75f, 21.664f, 11.414f, 22f, 11f, 22f)
            curveTo(10.62f, 22f, 10.307f, 21.718f, 10.257f, 21.352f)
            lineTo(10.25f, 21.25f)
            lineTo(10.25f, 18.982f)
            curveTo(6.833f, 18.732f, 4.123f, 15.938f, 4.004f, 12.486f)
            lineTo(4f, 12.25f)
            verticalLineTo(11.75f)
            curveTo(4f, 11.336f, 4.336f, 11f, 4.75f, 11f)
            curveTo(5.13f, 11f, 5.443f, 11.282f, 5.493f, 11.648f)
            lineTo(5.5f, 11.75f)
            verticalLineTo(12.25f)
            curveTo(5.5f, 15.077f, 7.734f, 17.382f, 10.534f, 17.496f)
            lineTo(10.75f, 17.5f)
            horizontalLineTo(11f)
            close()
            moveTo(15f, 6f)
            verticalLineTo(11.498f)
            curveTo(14.446f, 11.729f, 13.932f, 12.034f, 13.468f, 12.401f)
            curveTo(13.489f, 12.271f, 13.5f, 12.137f, 13.5f, 12f)
            verticalLineTo(6f)
            curveTo(13.5f, 4.619f, 12.381f, 3.5f, 11f, 3.5f)
            curveTo(9.619f, 3.5f, 8.5f, 4.619f, 8.5f, 6f)
            verticalLineTo(12f)
            curveTo(8.5f, 13.381f, 9.619f, 14.5f, 11f, 14.5f)
            curveTo(11.281f, 14.5f, 11.551f, 14.454f, 11.803f, 14.368f)
            curveTo(11.524f, 14.874f, 11.311f, 15.42f, 11.175f, 15.996f)
            curveTo(11.117f, 15.999f, 11.059f, 16f, 11f, 16f)
            curveTo(8.791f, 16f, 7f, 14.209f, 7f, 12f)
            verticalLineTo(6f)
            curveTo(7f, 3.791f, 8.791f, 2f, 11f, 2f)
            curveTo(13.209f, 2f, 15f, 3.791f, 15f, 6f)
            close()
            moveTo(23f, 17.5f)
            curveTo(23f, 14.462f, 20.538f, 12f, 17.5f, 12f)
            curveTo(14.462f, 12f, 12f, 14.462f, 12f, 17.5f)
            curveTo(12f, 20.538f, 14.462f, 23f, 17.5f, 23f)
            curveTo(20.538f, 23f, 23f, 20.538f, 23f, 17.5f)
            close()
            moveTo(16.015f, 14.5f)
            curveTo(16.224f, 14.506f, 16.408f, 14.643f, 16.474f, 14.842f)
            lineTo(17.528f, 18.002f)
            lineTo(18.532f, 15.324f)
            curveTo(18.602f, 15.138f, 18.775f, 15.011f, 18.974f, 15.001f)
            curveTo(19.172f, 14.99f, 19.358f, 15.099f, 19.447f, 15.276f)
            lineTo(20.309f, 17f)
            horizontalLineTo(21f)
            curveTo(21.276f, 17f, 21.5f, 17.224f, 21.5f, 17.5f)
            curveTo(21.5f, 17.776f, 21.276f, 18f, 21f, 18f)
            horizontalLineTo(20f)
            curveTo(19.811f, 18f, 19.638f, 17.893f, 19.553f, 17.724f)
            lineTo(19.066f, 16.749f)
            lineTo(17.968f, 19.676f)
            curveTo(17.894f, 19.874f, 17.702f, 20.004f, 17.491f, 20f)
            curveTo(17.279f, 19.996f, 17.093f, 19.859f, 17.026f, 19.658f)
            lineTo(15.957f, 16.453f)
            lineTo(15.464f, 17.686f)
            curveTo(15.388f, 17.875f, 15.205f, 18f, 15f, 18f)
            horizontalLineTo(14f)
            curveTo(13.724f, 18f, 13.5f, 17.776f, 13.5f, 17.5f)
            curveTo(13.5f, 17.224f, 13.724f, 17f, 14f, 17f)
            horizontalLineTo(14.661f)
            lineTo(15.536f, 14.814f)
            curveTo(15.614f, 14.62f, 15.805f, 14.494f, 16.015f, 14.5f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun MicPulsePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.MicPulse, contentDescription = null)
    }
}
