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

public val FluentUi.Regular.NoteEdit: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.NoteEdit",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(3f, 17.75f)
            curveTo(3f, 19.545f, 4.455f, 21f, 6.25f, 21f)
            horizontalLineTo(11.165f)
            lineTo(11.521f, 19.577f)
            curveTo(11.527f, 19.551f, 11.534f, 19.525f, 11.541f, 19.5f)
            horizontalLineTo(6.25f)
            curveTo(5.284f, 19.5f, 4.5f, 18.716f, 4.5f, 17.75f)
            verticalLineTo(11f)
            horizontalLineTo(7.75f)
            lineTo(7.934f, 10.995f)
            curveTo(9.644f, 10.899f, 11f, 9.483f, 11f, 7.75f)
            verticalLineTo(4.5f)
            horizontalLineTo(17.75f)
            curveTo(18.716f, 4.5f, 19.5f, 5.284f, 19.5f, 6.25f)
            verticalLineTo(11.232f)
            curveTo(19.979f, 11.042f, 20.493f, 10.969f, 21f, 11.012f)
            verticalLineTo(6.25f)
            curveTo(21f, 4.455f, 19.545f, 3f, 17.75f, 3f)
            horizontalLineTo(10.871f)
            curveTo(10.275f, 3f, 9.702f, 3.237f, 9.28f, 3.659f)
            lineTo(3.659f, 9.28f)
            curveTo(3.237f, 9.702f, 3f, 10.275f, 3f, 10.871f)
            verticalLineTo(17.75f)
            close()
            moveTo(7.75f, 9.5f)
            horizontalLineTo(5.561f)
            lineTo(9.5f, 5.561f)
            verticalLineTo(7.75f)
            lineTo(9.494f, 7.894f)
            curveTo(9.421f, 8.793f, 8.668f, 9.5f, 7.75f, 9.5f)
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
private fun NoteEditPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.NoteEdit, contentDescription = null)
    }
}
