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

public val FluentUi.Regular.ArrowSyncCircle: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ArrowSyncCircle",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(3.5f, 12f)
            curveTo(3.5f, 7.306f, 7.306f, 3.5f, 12f, 3.5f)
            curveTo(16.694f, 3.5f, 20.5f, 7.306f, 20.5f, 12f)
            curveTo(20.5f, 16.694f, 16.694f, 20.5f, 12f, 20.5f)
            curveTo(7.306f, 20.5f, 3.5f, 16.694f, 3.5f, 12f)
            close()
            moveTo(12f, 2f)
            curveTo(6.477f, 2f, 2f, 6.477f, 2f, 12f)
            curveTo(2f, 17.523f, 6.477f, 22f, 12f, 22f)
            curveTo(17.523f, 22f, 22f, 17.523f, 22f, 12f)
            curveTo(22f, 6.477f, 17.523f, 2f, 12f, 2f)
            close()
            moveTo(17.5f, 8.25f)
            curveTo(17.5f, 7.836f, 17.164f, 7.5f, 16.75f, 7.5f)
            curveTo(16.336f, 7.5f, 16f, 7.836f, 16f, 8.25f)
            verticalLineTo(8.999f)
            curveTo(15.088f, 7.785f, 13.636f, 7f, 12f, 7f)
            curveTo(10.473f, 7f, 9.106f, 7.685f, 8.19f, 8.762f)
            curveTo(7.922f, 9.078f, 7.96f, 9.551f, 8.275f, 9.819f)
            curveTo(8.591f, 10.088f, 9.064f, 10.049f, 9.333f, 9.734f)
            curveTo(9.976f, 8.978f, 10.932f, 8.5f, 12f, 8.5f)
            curveTo(13.396f, 8.5f, 14.601f, 9.318f, 15.163f, 10.5f)
            horizontalLineTo(13.75f)
            curveTo(13.336f, 10.5f, 13f, 10.836f, 13f, 11.25f)
            curveTo(13f, 11.664f, 13.336f, 12f, 13.75f, 12f)
            horizontalLineTo(16.75f)
            curveTo(17.164f, 12f, 17.5f, 11.664f, 17.5f, 11.25f)
            verticalLineTo(8.25f)
            close()
            moveTo(7.25f, 16.5f)
            curveTo(6.836f, 16.5f, 6.5f, 16.164f, 6.5f, 15.75f)
            verticalLineTo(12.75f)
            curveTo(6.5f, 12.336f, 6.836f, 12f, 7.25f, 12f)
            horizontalLineTo(10.25f)
            curveTo(10.664f, 12f, 11f, 12.336f, 11f, 12.75f)
            curveTo(11f, 13.164f, 10.664f, 13.5f, 10.25f, 13.5f)
            horizontalLineTo(8.837f)
            curveTo(9.399f, 14.682f, 10.604f, 15.5f, 12f, 15.5f)
            curveTo(13.068f, 15.5f, 14.024f, 15.023f, 14.667f, 14.267f)
            curveTo(14.935f, 13.952f, 15.408f, 13.914f, 15.724f, 14.182f)
            curveTo(16.039f, 14.451f, 16.077f, 14.924f, 15.809f, 15.239f)
            curveTo(14.893f, 16.316f, 13.526f, 17f, 12f, 17f)
            curveTo(10.364f, 17f, 8.912f, 16.215f, 8f, 15f)
            verticalLineTo(15.75f)
            curveTo(8f, 16.164f, 7.664f, 16.5f, 7.25f, 16.5f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ArrowSyncCirclePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.ArrowSyncCircle, contentDescription = null)
    }
}
