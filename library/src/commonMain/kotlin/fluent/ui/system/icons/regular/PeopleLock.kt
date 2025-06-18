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

public val FluentUi.Regular.PeopleLock: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.PeopleLock",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(8f, 4.5f)
            curveTo(6.619f, 4.5f, 5.5f, 5.619f, 5.5f, 7f)
            curveTo(5.5f, 8.381f, 6.619f, 9.5f, 8f, 9.5f)
            curveTo(9.381f, 9.5f, 10.5f, 8.381f, 10.5f, 7f)
            curveTo(10.5f, 5.619f, 9.381f, 4.5f, 8f, 4.5f)
            close()
            moveTo(4f, 7f)
            curveTo(4f, 4.791f, 5.791f, 3f, 8f, 3f)
            curveTo(10.209f, 3f, 12f, 4.791f, 12f, 7f)
            curveTo(12f, 9.209f, 10.209f, 11f, 8f, 11f)
            curveTo(5.791f, 11f, 4f, 9.209f, 4f, 7f)
            close()
            moveTo(17f, 6.5f)
            curveTo(16.172f, 6.5f, 15.5f, 7.172f, 15.5f, 8f)
            curveTo(15.5f, 8.828f, 16.172f, 9.5f, 17f, 9.5f)
            curveTo(17.828f, 9.5f, 18.5f, 8.828f, 18.5f, 8f)
            curveTo(18.5f, 7.172f, 17.828f, 6.5f, 17f, 6.5f)
            close()
            moveTo(14f, 8f)
            curveTo(14f, 6.343f, 15.343f, 5f, 17f, 5f)
            curveTo(18.657f, 5f, 20f, 6.343f, 20f, 8f)
            curveTo(20f, 9.133f, 19.372f, 10.119f, 18.446f, 10.629f)
            curveTo(18.145f, 10.545f, 17.828f, 10.5f, 17.5f, 10.5f)
            curveTo(16.967f, 10.5f, 16.461f, 10.619f, 16.009f, 10.833f)
            curveTo(14.839f, 10.423f, 14f, 9.31f, 14f, 8f)
            close()
            moveTo(13.702f, 14.13f)
            curveTo(13.314f, 13.455f, 12.585f, 13f, 11.75f, 13f)
            horizontalLineTo(4.25f)
            curveTo(3.007f, 13f, 2f, 14.007f, 2f, 15.25f)
            verticalLineTo(15.501f)
            lineTo(2f, 15.502f)
            lineTo(2f, 15.505f)
            lineTo(2f, 15.511f)
            lineTo(2f, 15.528f)
            curveTo(2.001f, 15.541f, 2.001f, 15.557f, 2.002f, 15.577f)
            curveTo(2.004f, 15.617f, 2.007f, 15.67f, 2.014f, 15.736f)
            curveTo(2.027f, 15.866f, 2.052f, 16.045f, 2.102f, 16.256f)
            curveTo(2.2f, 16.678f, 2.397f, 17.24f, 2.792f, 17.805f)
            curveTo(3.611f, 18.975f, 5.172f, 20f, 8f, 20f)
            curveTo(9.803f, 20f, 11.091f, 19.583f, 12f, 18.978f)
            verticalLineTo(16.915f)
            lineTo(11.979f, 16.945f)
            curveTo(11.486f, 17.65f, 10.422f, 18.5f, 8f, 18.5f)
            curveTo(5.578f, 18.5f, 4.514f, 17.65f, 4.021f, 16.945f)
            curveTo(3.76f, 16.572f, 3.628f, 16.197f, 3.562f, 15.915f)
            curveTo(3.53f, 15.775f, 3.514f, 15.661f, 3.507f, 15.587f)
            curveTo(3.503f, 15.549f, 3.501f, 15.522f, 3.5f, 15.507f)
            lineTo(3.5f, 15.495f)
            verticalLineTo(15.25f)
            curveTo(3.5f, 14.836f, 3.836f, 14.5f, 4.25f, 14.5f)
            horizontalLineTo(11.75f)
            curveTo(12.091f, 14.5f, 12.38f, 14.728f, 12.47f, 15.04f)
            curveTo(12.773f, 14.62f, 13.202f, 14.298f, 13.702f, 14.13f)
            close()
            moveTo(14.5f, 15f)
            horizontalLineTo(15f)
            verticalLineTo(14f)
            curveTo(15f, 12.619f, 16.119f, 11.5f, 17.5f, 11.5f)
            curveTo(18.881f, 11.5f, 20f, 12.619f, 20f, 14f)
            verticalLineTo(15f)
            horizontalLineTo(20.5f)
            curveTo(21.328f, 15f, 22f, 15.672f, 22f, 16.5f)
            verticalLineTo(21.5f)
            curveTo(22f, 22.328f, 21.328f, 23f, 20.5f, 23f)
            horizontalLineTo(14.5f)
            curveTo(13.672f, 23f, 13f, 22.328f, 13f, 21.5f)
            verticalLineTo(16.5f)
            curveTo(13f, 15.672f, 13.672f, 15f, 14.5f, 15f)
            close()
            moveTo(16.5f, 14f)
            verticalLineTo(15f)
            horizontalLineTo(18.5f)
            verticalLineTo(14f)
            curveTo(18.5f, 13.448f, 18.052f, 13f, 17.5f, 13f)
            curveTo(16.948f, 13f, 16.5f, 13.448f, 16.5f, 14f)
            close()
            moveTo(18.5f, 19f)
            curveTo(18.5f, 18.448f, 18.052f, 18f, 17.5f, 18f)
            curveTo(16.948f, 18f, 16.5f, 18.448f, 16.5f, 19f)
            curveTo(16.5f, 19.552f, 16.948f, 20f, 17.5f, 20f)
            curveTo(18.052f, 20f, 18.5f, 19.552f, 18.5f, 19f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun PeopleLockPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.PeopleLock, contentDescription = null)
    }
}
