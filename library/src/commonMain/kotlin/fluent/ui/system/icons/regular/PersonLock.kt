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

public val FluentUi.Regular.PersonLock: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.PersonLock",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(14f, 14f)
            horizontalLineTo(4.253f)
            curveTo(3.011f, 14f, 2.004f, 15.007f, 2.004f, 16.249f)
            verticalLineTo(16.827f)
            curveTo(2.004f, 17.719f, 2.322f, 18.583f, 2.902f, 19.262f)
            curveTo(4.468f, 21.096f, 6.854f, 22.001f, 10f, 22.001f)
            curveTo(10.715f, 22.001f, 11.39f, 21.955f, 12.026f, 21.861f)
            curveTo(12.009f, 21.743f, 12f, 21.623f, 12f, 21.5f)
            verticalLineTo(20.347f)
            curveTo(11.386f, 20.45f, 10.72f, 20.501f, 10f, 20.501f)
            curveTo(7.262f, 20.501f, 5.296f, 19.756f, 4.043f, 18.288f)
            curveTo(3.695f, 17.881f, 3.504f, 17.362f, 3.504f, 16.827f)
            verticalLineTo(16.249f)
            curveTo(3.504f, 15.835f, 3.839f, 15.5f, 4.253f, 15.5f)
            horizontalLineTo(12.208f)
            curveTo(12.529f, 14.765f, 13.194f, 14.214f, 14f, 14.05f)
            verticalLineTo(14f)
            close()
            moveTo(10f, 2.005f)
            curveTo(12.762f, 2.005f, 15f, 4.243f, 15f, 7.005f)
            curveTo(15f, 9.766f, 12.762f, 12.005f, 10f, 12.005f)
            curveTo(7.239f, 12.005f, 5f, 9.766f, 5f, 7.005f)
            curveTo(5f, 4.243f, 7.239f, 2.005f, 10f, 2.005f)
            close()
            moveTo(10f, 3.505f)
            curveTo(8.067f, 3.505f, 6.5f, 5.072f, 6.5f, 7.005f)
            curveTo(6.5f, 8.938f, 8.067f, 10.505f, 10f, 10.505f)
            curveTo(11.933f, 10.505f, 13.5f, 8.938f, 13.5f, 7.005f)
            curveTo(13.5f, 5.072f, 11.933f, 3.505f, 10f, 3.505f)
            close()
            moveTo(15f, 15f)
            horizontalLineTo(14.5f)
            curveTo(13.672f, 15f, 13f, 15.672f, 13f, 16.5f)
            verticalLineTo(21.5f)
            curveTo(13f, 22.329f, 13.672f, 23f, 14.5f, 23f)
            horizontalLineTo(20.5f)
            curveTo(21.328f, 23f, 22f, 22.329f, 22f, 21.5f)
            verticalLineTo(16.5f)
            curveTo(22f, 15.672f, 21.328f, 15f, 20.5f, 15f)
            horizontalLineTo(20f)
            verticalLineTo(14f)
            curveTo(20f, 12.62f, 18.881f, 11.5f, 17.5f, 11.5f)
            curveTo(16.119f, 11.5f, 15f, 12.62f, 15f, 14f)
            verticalLineTo(15f)
            close()
            moveTo(16.5f, 14f)
            curveTo(16.5f, 13.448f, 16.948f, 13f, 17.5f, 13f)
            curveTo(18.052f, 13f, 18.5f, 13.448f, 18.5f, 14f)
            verticalLineTo(15f)
            horizontalLineTo(16.5f)
            verticalLineTo(14f)
            close()
            moveTo(18.5f, 19f)
            curveTo(18.5f, 19.552f, 18.052f, 20f, 17.5f, 20f)
            curveTo(16.948f, 20f, 16.5f, 19.552f, 16.5f, 19f)
            curveTo(16.5f, 18.448f, 16.948f, 18f, 17.5f, 18f)
            curveTo(18.052f, 18f, 18.5f, 18.448f, 18.5f, 19f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun PersonLockPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.PersonLock, contentDescription = null)
    }
}
