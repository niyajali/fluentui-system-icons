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

public val FluentUi.Filled.TagLock: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.TagLock",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(19.75f, 2f)
            curveTo(20.993f, 2f, 22f, 3.007f, 22f, 4.25f)
            verticalLineTo(9.712f)
            curveTo(22f, 10.574f, 21.657f, 11.4f, 21.048f, 12.01f)
            lineTo(20.628f, 12.429f)
            curveTo(20.053f, 11.285f, 18.868f, 10.5f, 17.5f, 10.5f)
            curveTo(15.567f, 10.5f, 14f, 12.067f, 14f, 14f)
            verticalLineTo(14.05f)
            curveTo(12.859f, 14.282f, 12f, 15.29f, 12f, 16.5f)
            verticalLineTo(20.953f)
            curveTo(10.742f, 21.757f, 9.052f, 21.611f, 7.951f, 20.514f)
            lineTo(3.489f, 16.059f)
            curveTo(2.219f, 14.791f, 2.217f, 12.733f, 3.485f, 11.463f)
            lineTo(11.985f, 2.953f)
            curveTo(12.595f, 2.343f, 13.422f, 2f, 14.285f, 2f)
            horizontalLineTo(19.75f)
            close()
            moveTo(17f, 5.502f)
            curveTo(16.171f, 5.502f, 15.5f, 6.174f, 15.5f, 7.002f)
            curveTo(15.5f, 7.831f, 16.171f, 8.502f, 17f, 8.502f)
            curveTo(17.828f, 8.502f, 18.5f, 7.831f, 18.5f, 7.002f)
            curveTo(18.5f, 6.174f, 17.828f, 5.502f, 17f, 5.502f)
            close()
            moveTo(15f, 15f)
            horizontalLineTo(14.5f)
            curveTo(13.672f, 15f, 13f, 15.672f, 13f, 16.5f)
            verticalLineTo(21.5f)
            curveTo(13f, 22.328f, 13.672f, 23f, 14.5f, 23f)
            horizontalLineTo(20.5f)
            curveTo(21.328f, 23f, 22f, 22.328f, 22f, 21.5f)
            verticalLineTo(16.5f)
            curveTo(22f, 15.672f, 21.328f, 15f, 20.5f, 15f)
            horizontalLineTo(20f)
            verticalLineTo(14f)
            curveTo(20f, 12.619f, 18.881f, 11.5f, 17.5f, 11.5f)
            curveTo(16.119f, 11.5f, 15f, 12.619f, 15f, 14f)
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
private fun TagLockPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.TagLock, contentDescription = null)
    }
}
