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

public val FluentUi.Filled.PhoneFooterArrowDown: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.PhoneFooterArrowDown",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(18f, 4.25f)
            curveTo(18f, 3.007f, 16.993f, 2f, 15.75f, 2f)
            horizontalLineTo(8.25f)
            curveTo(7.007f, 2f, 6f, 3.007f, 6f, 4.25f)
            verticalLineTo(19.75f)
            curveTo(6f, 20.993f, 7.007f, 22f, 8.25f, 22f)
            horizontalLineTo(15.75f)
            curveTo(16.993f, 22f, 18f, 20.993f, 18f, 19.75f)
            verticalLineTo(4.25f)
            close()
            moveTo(8.5f, 18.25f)
            curveTo(8.5f, 17.836f, 8.836f, 17.5f, 9.25f, 17.5f)
            horizontalLineTo(14.75f)
            lineTo(14.852f, 17.507f)
            curveTo(15.218f, 17.556f, 15.5f, 17.87f, 15.5f, 18.25f)
            curveTo(15.5f, 18.664f, 15.164f, 19f, 14.75f, 19f)
            horizontalLineTo(9.25f)
            lineTo(9.148f, 18.993f)
            curveTo(8.782f, 18.944f, 8.5f, 18.63f, 8.5f, 18.25f)
            close()
            moveTo(11.993f, 16f)
            curveTo(11.794f, 15.998f, 11.604f, 15.917f, 11.465f, 15.775f)
            lineTo(9.015f, 13.275f)
            curveTo(8.725f, 12.979f, 8.73f, 12.504f, 9.026f, 12.214f)
            curveTo(9.322f, 11.924f, 9.797f, 11.929f, 10.086f, 12.225f)
            lineTo(11.25f, 13.412f)
            verticalLineTo(9.75f)
            curveTo(11.25f, 9.336f, 11.586f, 9f, 12f, 9f)
            curveTo(12.414f, 9f, 12.75f, 9.336f, 12.75f, 9.75f)
            verticalLineTo(13.465f)
            lineTo(14.025f, 12.215f)
            curveTo(14.321f, 11.925f, 14.795f, 11.929f, 15.085f, 12.225f)
            curveTo(15.375f, 12.521f, 15.371f, 12.995f, 15.075f, 13.285f)
            lineTo(12.526f, 15.785f)
            curveTo(12.384f, 15.925f, 12.192f, 16.002f, 11.993f, 16f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun PhoneFooterArrowDownPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.PhoneFooterArrowDown, contentDescription = null)
    }
}
