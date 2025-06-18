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
package fluent.ui.system.icons.filled

import org.jetbrains.compose.ui.tooling.preview.Preview
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

public val FluentUi.Filled.PeopleLock: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.PeopleLock",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(12f, 7f)
            curveTo(12f, 9.209f, 10.209f, 11f, 8f, 11f)
            curveTo(5.791f, 11f, 4f, 9.209f, 4f, 7f)
            curveTo(4f, 4.791f, 5.791f, 3f, 8f, 3f)
            curveTo(10.209f, 3f, 12f, 4.791f, 12f, 7f)
            close()
            moveTo(16.009f, 10.833f)
            curveTo(16.461f, 10.619f, 16.967f, 10.5f, 17.5f, 10.5f)
            curveTo(17.828f, 10.5f, 18.145f, 10.545f, 18.446f, 10.629f)
            curveTo(19.372f, 10.119f, 20f, 9.133f, 20f, 8f)
            curveTo(20f, 6.343f, 18.657f, 5f, 17f, 5f)
            curveTo(15.343f, 5f, 14f, 6.343f, 14f, 8f)
            curveTo(14f, 9.31f, 14.839f, 10.423f, 16.009f, 10.833f)
            close()
            moveTo(13.702f, 14.13f)
            curveTo(12.713f, 14.463f, 12f, 15.398f, 12f, 16.5f)
            verticalLineTo(18.99f)
            curveTo(11.116f, 19.577f, 9.84f, 20f, 8f, 20f)
            curveTo(2f, 20f, 2f, 15.5f, 2f, 15.5f)
            verticalLineTo(15.25f)
            curveTo(2f, 14.007f, 3.007f, 13f, 4.25f, 13f)
            horizontalLineTo(11.75f)
            curveTo(12.585f, 13f, 13.314f, 13.455f, 13.702f, 14.13f)
            close()
            moveTo(15f, 15f)
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
            horizontalLineTo(15f)
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
        Image(imageVector = FluentUi.Filled.PeopleLock, contentDescription = null)
    }
}
