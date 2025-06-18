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

public val FluentIcons.Filled.ColumnEdit: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ColumnEdit",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(3.25f, 3f)
            curveTo(2.836f, 3f, 2.5f, 3.336f, 2.5f, 3.75f)
            curveTo(2.5f, 4.164f, 2.836f, 4.5f, 3.25f, 4.5f)
            horizontalLineTo(3.75f)
            curveTo(4.44f, 4.5f, 5f, 5.06f, 5f, 5.75f)
            verticalLineTo(18.25f)
            curveTo(5f, 18.94f, 4.44f, 19.5f, 3.75f, 19.5f)
            horizontalLineTo(3.25f)
            curveTo(2.836f, 19.5f, 2.5f, 19.836f, 2.5f, 20.25f)
            curveTo(2.5f, 20.664f, 2.836f, 21f, 3.25f, 21f)
            horizontalLineTo(3.75f)
            curveTo(5.269f, 21f, 6.5f, 19.769f, 6.5f, 18.25f)
            verticalLineTo(5.75f)
            curveTo(6.5f, 4.231f, 5.269f, 3f, 3.75f, 3f)
            horizontalLineTo(3.25f)
            close()
            moveTo(8f, 5.75f)
            curveTo(8f, 4.231f, 9.231f, 3f, 10.75f, 3f)
            horizontalLineTo(13.25f)
            curveTo(14.769f, 3f, 16f, 4.231f, 16f, 5.75f)
            verticalLineTo(14.355f)
            lineTo(12.49f, 17.865f)
            curveTo(12.018f, 18.337f, 11.683f, 18.929f, 11.521f, 19.577f)
            lineTo(11.165f, 21f)
            horizontalLineTo(10.75f)
            curveTo(9.231f, 21f, 8f, 19.769f, 8f, 18.25f)
            verticalLineTo(5.75f)
            close()
            moveTo(19f, 11.483f)
            verticalLineTo(5.75f)
            curveTo(19f, 5.06f, 19.56f, 4.5f, 20.25f, 4.5f)
            horizontalLineTo(20.75f)
            curveTo(21.164f, 4.5f, 21.5f, 4.164f, 21.5f, 3.75f)
            curveTo(21.5f, 3.336f, 21.164f, 3f, 20.75f, 3f)
            horizontalLineTo(20.25f)
            curveTo(18.731f, 3f, 17.5f, 4.231f, 17.5f, 5.75f)
            verticalLineTo(12.855f)
            lineTo(18.393f, 11.962f)
            curveTo(18.58f, 11.775f, 18.784f, 11.615f, 19f, 11.483f)
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
private fun ColumnEditPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.ColumnEdit, contentDescription = null)
    }
}
