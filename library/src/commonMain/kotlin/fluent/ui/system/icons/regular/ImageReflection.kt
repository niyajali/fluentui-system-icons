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

public val FluentUi.Regular.ImageReflection: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ImageReflection",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(16.25f, 7.75f)
            curveTo(16.25f, 8.44f, 15.69f, 9f, 15f, 9f)
            curveTo(14.31f, 9f, 13.75f, 8.44f, 13.75f, 7.75f)
            curveTo(13.75f, 7.06f, 14.31f, 6.5f, 15f, 6.5f)
            curveTo(15.69f, 6.5f, 16.25f, 7.06f, 16.25f, 7.75f)
            close()
            moveTo(16.917f, 16.992f)
            curveTo(16.862f, 16.997f, 16.806f, 17f, 16.75f, 17f)
            horizontalLineTo(15.75f)
            curveTo(15.336f, 17f, 15f, 17.336f, 15f, 17.75f)
            curveTo(15f, 18.164f, 15.336f, 18.5f, 15.75f, 18.5f)
            horizontalLineTo(16.75f)
            curveTo(17.716f, 18.5f, 18.5f, 19.284f, 18.5f, 20.25f)
            verticalLineTo(21f)
            curveTo(18.5f, 21.414f, 18.836f, 21.75f, 19.25f, 21.75f)
            curveTo(19.664f, 21.75f, 20f, 21.414f, 20f, 21f)
            verticalLineTo(20.25f)
            curveTo(20f, 19.245f, 19.544f, 18.346f, 18.827f, 17.75f)
            curveTo(19.544f, 17.154f, 20f, 16.255f, 20f, 15.25f)
            verticalLineTo(6.25f)
            curveTo(20f, 4.455f, 18.545f, 3f, 16.75f, 3f)
            horizontalLineTo(7.25f)
            curveTo(5.455f, 3f, 4f, 4.455f, 4f, 6.25f)
            verticalLineTo(15.25f)
            curveTo(4f, 16.255f, 4.456f, 17.154f, 5.173f, 17.75f)
            curveTo(4.456f, 18.346f, 4f, 19.245f, 4f, 20.25f)
            verticalLineTo(21f)
            curveTo(4f, 21.414f, 4.336f, 21.75f, 4.75f, 21.75f)
            curveTo(5.164f, 21.75f, 5.5f, 21.414f, 5.5f, 21f)
            verticalLineTo(20.25f)
            curveTo(5.5f, 19.284f, 6.284f, 18.5f, 7.25f, 18.5f)
            horizontalLineTo(8.25f)
            curveTo(8.664f, 18.5f, 9f, 18.164f, 9f, 17.75f)
            curveTo(9f, 17.336f, 8.664f, 17f, 8.25f, 17f)
            horizontalLineTo(7.25f)
            curveTo(7.193f, 17f, 7.137f, 16.997f, 7.082f, 16.992f)
            lineTo(11.476f, 12.708f)
            curveTo(11.767f, 12.424f, 12.232f, 12.424f, 12.523f, 12.708f)
            lineTo(16.917f, 16.992f)
            close()
            moveTo(7.25f, 4.5f)
            horizontalLineTo(16.75f)
            curveTo(17.716f, 4.5f, 18.5f, 5.284f, 18.5f, 6.25f)
            verticalLineTo(15.25f)
            curveTo(18.5f, 15.592f, 18.402f, 15.91f, 18.233f, 16.18f)
            lineTo(13.571f, 11.634f)
            curveTo(12.697f, 10.782f, 11.303f, 10.782f, 10.429f, 11.634f)
            lineTo(5.767f, 16.179f)
            curveTo(5.598f, 15.91f, 5.5f, 15.591f, 5.5f, 15.25f)
            verticalLineTo(6.25f)
            curveTo(5.5f, 5.284f, 6.284f, 4.5f, 7.25f, 4.5f)
            close()
            moveTo(11.25f, 17f)
            curveTo(10.836f, 17f, 10.5f, 17.336f, 10.5f, 17.75f)
            curveTo(10.5f, 18.164f, 10.836f, 18.5f, 11.25f, 18.5f)
            horizontalLineTo(12.75f)
            curveTo(13.164f, 18.5f, 13.5f, 18.164f, 13.5f, 17.75f)
            curveTo(13.5f, 17.336f, 13.164f, 17f, 12.75f, 17f)
            horizontalLineTo(11.25f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ImageReflectionPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.ImageReflection, contentDescription = null)
    }
}
