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
import fluent.ui.system.icons.FluentIcons
import org.jetbrains.compose.ui.tooling.preview.Preview

public val FluentIcons.Filled.Pill: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Pill",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(13.302f, 3.525f)
            curveTo(15.283f, 1.545f, 18.493f, 1.545f, 20.474f, 3.525f)
            curveTo(22.454f, 5.506f, 22.454f, 8.717f, 20.474f, 10.697f)
            lineTo(10.696f, 20.475f)
            curveTo(8.716f, 22.455f, 5.505f, 22.455f, 3.524f, 20.475f)
            curveTo(1.544f, 18.494f, 1.544f, 15.284f, 3.524f, 13.303f)
            lineTo(13.302f, 3.525f)
            close()
            moveTo(19.413f, 4.586f)
            curveTo(18.019f, 3.191f, 15.757f, 3.191f, 14.363f, 4.586f)
            lineTo(10.004f, 8.945f)
            lineTo(15.055f, 13.995f)
            lineTo(19.413f, 9.636f)
            curveTo(20.808f, 8.242f, 20.808f, 5.981f, 19.413f, 4.586f)
            close()
            moveTo(10.807f, 18.277f)
            curveTo(11.1f, 17.985f, 11.1f, 17.51f, 10.807f, 17.217f)
            curveTo(10.514f, 16.924f, 10.04f, 16.924f, 9.747f, 17.217f)
            lineTo(8.306f, 18.658f)
            curveTo(7.728f, 19.235f, 6.795f, 19.244f, 6.206f, 18.679f)
            lineTo(6.189f, 18.663f)
            curveTo(5.891f, 18.376f, 5.416f, 18.386f, 5.129f, 18.684f)
            curveTo(4.842f, 18.983f, 4.852f, 19.458f, 5.15f, 19.745f)
            lineTo(5.167f, 19.761f)
            curveTo(6.345f, 20.892f, 8.212f, 20.873f, 9.366f, 19.718f)
            lineTo(10.807f, 18.277f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun PillPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.Pill, contentDescription = null)
    }
}
