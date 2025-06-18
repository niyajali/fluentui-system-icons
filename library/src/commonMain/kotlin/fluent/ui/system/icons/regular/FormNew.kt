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

public val FluentUi.Regular.FormNew: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.FormNew",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(6.25f, 3f)
            curveTo(4.455f, 3f, 3f, 4.455f, 3f, 6.25f)
            verticalLineTo(17.75f)
            curveTo(3f, 19.545f, 4.455f, 21f, 6.25f, 21f)
            horizontalLineTo(12.022f)
            curveTo(11.725f, 20.537f, 11.486f, 20.034f, 11.314f, 19.5f)
            horizontalLineTo(6.25f)
            curveTo(5.284f, 19.5f, 4.5f, 18.716f, 4.5f, 17.75f)
            verticalLineTo(6.25f)
            curveTo(4.5f, 5.284f, 5.284f, 4.5f, 6.25f, 4.5f)
            horizontalLineTo(17.75f)
            curveTo(18.716f, 4.5f, 19.5f, 5.284f, 19.5f, 6.25f)
            verticalLineTo(11.314f)
            curveTo(20.034f, 11.486f, 20.537f, 11.725f, 21f, 12.022f)
            verticalLineTo(6.25f)
            curveTo(21f, 4.455f, 19.545f, 3f, 17.75f, 3f)
            horizontalLineTo(6.25f)
            close()
            moveTo(17.5f, 11f)
            curveTo(17.652f, 11f, 17.802f, 11.005f, 17.952f, 11.015f)
            curveTo(17.983f, 10.933f, 18f, 10.844f, 18f, 10.75f)
            curveTo(18f, 10.336f, 17.664f, 10f, 17.25f, 10f)
            horizontalLineTo(12.75f)
            curveTo(12.336f, 10f, 12f, 10.336f, 12f, 10.75f)
            curveTo(12f, 11.164f, 12.336f, 11.5f, 12.75f, 11.5f)
            horizontalLineTo(14.996f)
            curveTo(15.766f, 11.178f, 16.612f, 11f, 17.5f, 11f)
            close()
            moveTo(6.75f, 6f)
            curveTo(6.336f, 6f, 6f, 6.336f, 6f, 6.75f)
            curveTo(6f, 7.164f, 6.336f, 7.5f, 6.75f, 7.5f)
            horizontalLineTo(17.25f)
            curveTo(17.664f, 7.5f, 18f, 7.164f, 18f, 6.75f)
            curveTo(18f, 6.336f, 17.664f, 6f, 17.25f, 6f)
            horizontalLineTo(6.75f)
            close()
            moveTo(6f, 10.75f)
            curveTo(6f, 9.507f, 7.007f, 8.5f, 8.25f, 8.5f)
            curveTo(9.493f, 8.5f, 10.5f, 9.507f, 10.5f, 10.75f)
            curveTo(10.5f, 11.993f, 9.493f, 13f, 8.25f, 13f)
            curveTo(7.007f, 13f, 6f, 11.993f, 6f, 10.75f)
            close()
            moveTo(8.25f, 10f)
            curveTo(7.836f, 10f, 7.5f, 10.336f, 7.5f, 10.75f)
            curveTo(7.5f, 11.164f, 7.836f, 11.5f, 8.25f, 11.5f)
            curveTo(8.664f, 11.5f, 9f, 11.164f, 9f, 10.75f)
            curveTo(9f, 10.336f, 8.664f, 10f, 8.25f, 10f)
            close()
            moveTo(8.25f, 14f)
            curveTo(7.007f, 14f, 6f, 15.007f, 6f, 16.25f)
            curveTo(6f, 17.493f, 7.007f, 18.5f, 8.25f, 18.5f)
            curveTo(9.493f, 18.5f, 10.5f, 17.493f, 10.5f, 16.25f)
            curveTo(10.5f, 15.007f, 9.493f, 14f, 8.25f, 14f)
            close()
            moveTo(7.5f, 16.25f)
            curveTo(7.5f, 15.836f, 7.836f, 15.5f, 8.25f, 15.5f)
            curveTo(8.664f, 15.5f, 9f, 15.836f, 9f, 16.25f)
            curveTo(9f, 16.664f, 8.664f, 17f, 8.25f, 17f)
            curveTo(7.836f, 17f, 7.5f, 16.664f, 7.5f, 16.25f)
            close()
            moveTo(23f, 17.5f)
            curveTo(23f, 14.462f, 20.538f, 12f, 17.5f, 12f)
            curveTo(14.462f, 12f, 12f, 14.462f, 12f, 17.5f)
            curveTo(12f, 20.538f, 14.462f, 23f, 17.5f, 23f)
            curveTo(20.538f, 23f, 23f, 20.538f, 23f, 17.5f)
            close()
            moveTo(18.001f, 18f)
            lineTo(18.001f, 20.503f)
            curveTo(18.001f, 20.78f, 17.777f, 21.003f, 17.501f, 21.003f)
            curveTo(17.225f, 21.003f, 17.001f, 20.78f, 17.001f, 20.503f)
            lineTo(17.001f, 18f)
            horizontalLineTo(14.496f)
            curveTo(14.22f, 18f, 13.996f, 17.776f, 13.996f, 17.5f)
            curveTo(13.996f, 17.224f, 14.22f, 17f, 14.496f, 17f)
            horizontalLineTo(17f)
            lineTo(17f, 14.499f)
            curveTo(17f, 14.223f, 17.224f, 13.999f, 17.5f, 13.999f)
            curveTo(17.776f, 13.999f, 18f, 14.223f, 18f, 14.499f)
            lineTo(18f, 17f)
            horizontalLineTo(20.497f)
            curveTo(20.772f, 17f, 20.996f, 17.224f, 20.996f, 17.5f)
            curveTo(20.996f, 17.776f, 20.772f, 18f, 20.497f, 18f)
            horizontalLineTo(18.001f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun FormNewPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.FormNew, contentDescription = null)
    }
}
