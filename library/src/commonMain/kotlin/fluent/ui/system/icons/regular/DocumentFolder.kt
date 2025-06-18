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

public val FluentUi.Regular.DocumentFolder: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.DocumentFolder",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(18.497f, 4.627f)
            lineTo(18.5f, 6.75f)
            verticalLineTo(15f)
            horizontalLineTo(17.5f)
            verticalLineTo(4.25f)
            curveTo(17.5f, 3.007f, 16.493f, 2f, 15.25f, 2f)
            horizontalLineTo(6.25f)
            curveTo(5.007f, 2f, 4f, 3.007f, 4f, 4.25f)
            verticalLineTo(8.379f)
            curveTo(3.397f, 8.783f, 3f, 9.47f, 3f, 10.25f)
            verticalLineTo(18.75f)
            curveTo(3f, 20.545f, 4.455f, 22f, 6.25f, 22f)
            horizontalLineTo(8.617f)
            curveTo(8.663f, 22.003f, 8.709f, 22.004f, 8.756f, 22.004f)
            horizontalLineTo(15.25f)
            curveTo(15.318f, 22.004f, 15.385f, 22.003f, 15.452f, 22f)
            horizontalLineTo(17.75f)
            curveTo(19.545f, 22f, 21f, 20.545f, 21f, 18.75f)
            verticalLineTo(17.25f)
            curveTo(21f, 16.47f, 20.603f, 15.783f, 20f, 15.379f)
            verticalLineTo(6.75f)
            curveTo(20f, 5.769f, 19.373f, 4.935f, 18.497f, 4.627f)
            close()
            moveTo(5.5f, 8f)
            verticalLineTo(4.25f)
            curveTo(5.5f, 3.836f, 5.836f, 3.5f, 6.25f, 3.5f)
            horizontalLineTo(15.25f)
            curveTo(15.664f, 3.5f, 16f, 3.836f, 16f, 4.25f)
            verticalLineTo(15f)
            horizontalLineTo(15.904f)
            curveTo(15.696f, 15f, 15.496f, 14.913f, 15.354f, 14.76f)
            lineTo(9.745f, 8.719f)
            curveTo(9.319f, 8.261f, 8.722f, 8f, 8.096f, 8f)
            horizontalLineTo(5.5f)
            close()
            moveTo(4.5f, 10.25f)
            curveTo(4.5f, 9.836f, 4.836f, 9.5f, 5.25f, 9.5f)
            horizontalLineTo(8.096f)
            curveTo(8.304f, 9.5f, 8.504f, 9.587f, 8.645f, 9.74f)
            lineTo(14.255f, 15.781f)
            curveTo(14.681f, 16.24f, 15.278f, 16.5f, 15.904f, 16.5f)
            horizontalLineTo(18.75f)
            curveTo(19.164f, 16.5f, 19.5f, 16.836f, 19.5f, 17.25f)
            verticalLineTo(18.75f)
            curveTo(19.5f, 19.716f, 18.716f, 20.5f, 17.75f, 20.5f)
            horizontalLineTo(6.25f)
            curveTo(5.284f, 20.5f, 4.5f, 19.716f, 4.5f, 18.75f)
            verticalLineTo(10.25f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun DocumentFolderPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.DocumentFolder, contentDescription = null)
    }
}
