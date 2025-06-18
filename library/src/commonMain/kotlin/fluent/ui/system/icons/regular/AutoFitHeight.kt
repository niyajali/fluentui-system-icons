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

public val FluentIcons.Regular.AutoFitHeight: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.AutoFitHeight",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(5.75f, 3f)
            curveTo(5.336f, 3f, 5f, 3.336f, 5f, 3.75f)
            curveTo(5f, 4.164f, 5.336f, 4.5f, 5.75f, 4.5f)
            horizontalLineTo(18.25f)
            curveTo(18.664f, 4.5f, 19f, 4.164f, 19f, 3.75f)
            curveTo(19f, 3.336f, 18.664f, 3f, 18.25f, 3f)
            horizontalLineTo(5.75f)
            close()
            moveTo(9.222f, 14.219f)
            curveTo(9.488f, 13.953f, 9.905f, 13.928f, 10.198f, 14.146f)
            lineTo(10.282f, 14.219f)
            lineTo(11.502f, 15.44f)
            verticalLineTo(12.369f)
            lineTo(11.5f, 12.344f)
            verticalLineTo(8.56f)
            lineTo(10.28f, 9.781f)
            lineTo(10.196f, 9.854f)
            curveTo(9.903f, 10.072f, 9.486f, 10.047f, 9.22f, 9.781f)
            curveTo(8.953f, 9.515f, 8.929f, 9.098f, 9.147f, 8.805f)
            lineTo(9.22f, 8.72f)
            lineTo(11.587f, 6.35f)
            curveTo(11.713f, 6.142f, 11.963f, 6f, 12.251f, 6f)
            curveTo(12.503f, 6f, 12.726f, 6.109f, 12.862f, 6.276f)
            lineTo(12.915f, 6.351f)
            lineTo(15.282f, 8.72f)
            lineTo(15.355f, 8.805f)
            curveTo(15.548f, 9.066f, 15.551f, 9.424f, 15.362f, 9.687f)
            lineTo(15.282f, 9.781f)
            lineTo(15.198f, 9.854f)
            curveTo(14.937f, 10.047f, 14.579f, 10.05f, 14.315f, 9.861f)
            lineTo(14.221f, 9.781f)
            lineTo(13f, 8.56f)
            verticalLineTo(11.631f)
            lineTo(13.002f, 11.656f)
            verticalLineTo(15.44f)
            lineTo(14.223f, 14.219f)
            curveTo(14.49f, 13.953f, 14.906f, 13.928f, 15.2f, 14.146f)
            lineTo(15.284f, 14.219f)
            curveTo(15.55f, 14.485f, 15.574f, 14.902f, 15.356f, 15.195f)
            lineTo(15.284f, 15.28f)
            lineTo(12.917f, 17.649f)
            curveTo(12.791f, 17.858f, 12.541f, 18f, 12.253f, 18f)
            curveTo(11.965f, 18f, 11.715f, 17.858f, 11.589f, 17.65f)
            lineTo(9.222f, 15.28f)
            curveTo(8.929f, 14.987f, 8.929f, 14.512f, 9.222f, 14.219f)
            close()
            moveTo(5f, 20.25f)
            curveTo(5f, 19.836f, 5.336f, 19.5f, 5.75f, 19.5f)
            horizontalLineTo(18.25f)
            curveTo(18.664f, 19.5f, 19f, 19.836f, 19f, 20.25f)
            curveTo(19f, 20.664f, 18.664f, 21f, 18.25f, 21f)
            horizontalLineTo(5.75f)
            curveTo(5.336f, 21f, 5f, 20.664f, 5f, 20.25f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun AutoFitHeightPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.AutoFitHeight, contentDescription = null)
    }
}
