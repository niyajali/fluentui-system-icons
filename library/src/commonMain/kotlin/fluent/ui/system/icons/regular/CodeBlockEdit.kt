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

public val FluentUi.Regular.CodeBlockEdit: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.CodeBlockEdit",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(3f, 6.25f)
            curveTo(3f, 4.455f, 4.455f, 3f, 6.25f, 3f)
            horizontalLineTo(17.75f)
            curveTo(19.545f, 3f, 21f, 4.455f, 21f, 6.25f)
            verticalLineTo(11.012f)
            curveTo(20.493f, 10.969f, 19.979f, 11.042f, 19.5f, 11.233f)
            verticalLineTo(6.25f)
            curveTo(19.5f, 5.284f, 18.716f, 4.5f, 17.75f, 4.5f)
            horizontalLineTo(6.25f)
            curveTo(5.284f, 4.5f, 4.5f, 5.284f, 4.5f, 6.25f)
            verticalLineTo(17.75f)
            curveTo(4.5f, 18.716f, 5.284f, 19.5f, 6.25f, 19.5f)
            horizontalLineTo(11.542f)
            curveTo(11.535f, 19.525f, 11.528f, 19.551f, 11.522f, 19.577f)
            lineTo(11.166f, 21f)
            horizontalLineTo(6.25f)
            curveTo(4.455f, 21f, 3f, 19.545f, 3f, 17.75f)
            verticalLineTo(6.25f)
            close()
            moveTo(10.53f, 8.22f)
            curveTo(10.823f, 8.513f, 10.823f, 8.987f, 10.53f, 9.28f)
            lineTo(7.811f, 12f)
            lineTo(10.53f, 14.72f)
            curveTo(10.823f, 15.013f, 10.823f, 15.487f, 10.53f, 15.78f)
            curveTo(10.237f, 16.073f, 9.763f, 16.073f, 9.47f, 15.78f)
            lineTo(6.22f, 12.53f)
            curveTo(5.927f, 12.237f, 5.927f, 11.763f, 6.22f, 11.47f)
            lineTo(9.47f, 8.22f)
            curveTo(9.763f, 7.927f, 10.237f, 7.927f, 10.53f, 8.22f)
            close()
            moveTo(13.47f, 8.22f)
            curveTo(13.763f, 7.927f, 14.237f, 7.927f, 14.53f, 8.22f)
            lineTo(17.78f, 11.47f)
            curveTo(18.073f, 11.763f, 18.073f, 12.237f, 17.78f, 12.53f)
            lineTo(14.53f, 15.78f)
            curveTo(14.237f, 16.073f, 13.763f, 16.073f, 13.47f, 15.78f)
            curveTo(13.177f, 15.487f, 13.177f, 15.013f, 13.47f, 14.72f)
            lineTo(16.189f, 12f)
            lineTo(13.47f, 9.28f)
            curveTo(13.177f, 8.987f, 13.177f, 8.513f, 13.47f, 8.22f)
            close()
            moveTo(19.1f, 12.67f)
            lineTo(13.197f, 18.572f)
            curveTo(12.853f, 18.916f, 12.609f, 19.347f, 12.491f, 19.819f)
            lineTo(12.033f, 21.65f)
            curveTo(11.834f, 22.446f, 12.556f, 23.167f, 13.352f, 22.968f)
            lineTo(15.182f, 22.511f)
            curveTo(15.655f, 22.393f, 16.086f, 22.149f, 16.43f, 21.804f)
            lineTo(22.332f, 15.902f)
            curveTo(23.225f, 15.009f, 23.225f, 13.562f, 22.332f, 12.67f)
            curveTo(21.44f, 11.777f, 19.993f, 11.777f, 19.1f, 12.67f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun CodeBlockEditPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.CodeBlockEdit, contentDescription = null)
    }
}
