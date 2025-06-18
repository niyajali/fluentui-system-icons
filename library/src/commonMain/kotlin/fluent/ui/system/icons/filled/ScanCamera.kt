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

public val FluentIcons.Filled.ScanCamera: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ScanCamera",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(5.25f, 4f)
            curveTo(4.56f, 4f, 4f, 4.56f, 4f, 5.25f)
            verticalLineTo(8f)
            curveTo(4f, 8.552f, 3.552f, 9f, 3f, 9f)
            curveTo(2.448f, 9f, 2f, 8.552f, 2f, 8f)
            verticalLineTo(5.25f)
            curveTo(2f, 3.455f, 3.455f, 2f, 5.25f, 2f)
            horizontalLineTo(8f)
            curveTo(8.552f, 2f, 9f, 2.448f, 9f, 3f)
            curveTo(9f, 3.552f, 8.552f, 4f, 8f, 4f)
            horizontalLineTo(5.25f)
            close()
            moveTo(5.25f, 20f)
            curveTo(4.56f, 20f, 4f, 19.44f, 4f, 18.75f)
            verticalLineTo(16f)
            curveTo(4f, 15.448f, 3.552f, 15f, 3f, 15f)
            curveTo(2.448f, 15f, 2f, 15.448f, 2f, 16f)
            verticalLineTo(18.75f)
            curveTo(2f, 20.545f, 3.455f, 22f, 5.25f, 22f)
            horizontalLineTo(8f)
            curveTo(8.552f, 22f, 9f, 21.552f, 9f, 21f)
            curveTo(9f, 20.448f, 8.552f, 20f, 8f, 20f)
            horizontalLineTo(5.25f)
            close()
            moveTo(20f, 5.25f)
            curveTo(20f, 4.56f, 19.44f, 4f, 18.75f, 4f)
            horizontalLineTo(16f)
            curveTo(15.448f, 4f, 15f, 3.552f, 15f, 3f)
            curveTo(15f, 2.448f, 15.448f, 2f, 16f, 2f)
            horizontalLineTo(18.75f)
            curveTo(20.545f, 2f, 22f, 3.455f, 22f, 5.25f)
            verticalLineTo(8f)
            curveTo(22f, 8.552f, 21.552f, 9f, 21f, 9f)
            curveTo(20.448f, 9f, 20f, 8.552f, 20f, 8f)
            verticalLineTo(5.25f)
            close()
            moveTo(18.75f, 20f)
            curveTo(19.44f, 20f, 20f, 19.44f, 20f, 18.75f)
            verticalLineTo(16f)
            curveTo(20f, 15.448f, 20.448f, 15f, 21f, 15f)
            curveTo(21.552f, 15f, 22f, 15.448f, 22f, 16f)
            verticalLineTo(18.75f)
            curveTo(22f, 20.545f, 20.545f, 22f, 18.75f, 22f)
            horizontalLineTo(16f)
            curveTo(15.448f, 22f, 15f, 21.552f, 15f, 21f)
            curveTo(15f, 20.448f, 15.448f, 20f, 16f, 20f)
            horizontalLineTo(18.75f)
            close()
            moveTo(12f, 13f)
            curveTo(12.552f, 13f, 13f, 12.552f, 13f, 12f)
            curveTo(13f, 11.448f, 12.552f, 11f, 12f, 11f)
            curveTo(11.448f, 11f, 11f, 11.448f, 11f, 12f)
            curveTo(11f, 12.552f, 11.448f, 13f, 12f, 13f)
            close()
            moveTo(10.848f, 7f)
            curveTo(10.375f, 7f, 9.942f, 7.263f, 9.73f, 7.678f)
            lineTo(9.242f, 9f)
            horizontalLineTo(8.667f)
            curveTo(7.746f, 9f, 7f, 9.596f, 7f, 10.5f)
            verticalLineTo(14.364f)
            curveTo(7f, 15.267f, 7.746f, 16f, 8.667f, 16f)
            horizontalLineTo(15.333f)
            curveTo(16.254f, 16f, 17f, 15.267f, 17f, 14.364f)
            verticalLineTo(10.5f)
            curveTo(17f, 9.596f, 16.254f, 9f, 15.333f, 9f)
            horizontalLineTo(14.757f)
            lineTo(14.27f, 7.678f)
            curveTo(14.058f, 7.263f, 13.625f, 7f, 13.152f, 7f)
            horizontalLineTo(10.848f)
            close()
            moveTo(12f, 14f)
            curveTo(10.895f, 14f, 10f, 13.105f, 10f, 12f)
            curveTo(10f, 10.895f, 10.895f, 10f, 12f, 10f)
            curveTo(13.105f, 10f, 14f, 10.895f, 14f, 12f)
            curveTo(14f, 13.105f, 13.105f, 14f, 12f, 14f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ScanCameraPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.ScanCamera, contentDescription = null)
    }
}
