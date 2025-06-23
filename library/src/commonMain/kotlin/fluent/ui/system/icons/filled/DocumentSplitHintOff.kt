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
import org.jetbrains.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentIcons

public val FluentIcons.Filled.DocumentSplitHintOff: ImageVector
    get() {
        if (_DocumentSplitHintOff != null) {
            return _DocumentSplitHintOff!!
        }
        _DocumentSplitHintOff = ImageVector.Builder(
            name = "Filled.DocumentSplitHintOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(3.28f, 2.22f)
                curveTo(2.987f, 1.927f, 2.513f, 1.927f, 2.22f, 2.22f)
                curveTo(1.927f, 2.513f, 1.927f, 2.987f, 2.22f, 3.28f)
                lineTo(4f, 5.061f)
                verticalLineTo(11.5f)
                curveTo(4f, 11.776f, 4.224f, 12f, 4.5f, 12f)
                horizontalLineTo(10.939f)
                lineTo(18.5f, 19.561f)
                verticalLineTo(20f)
                curveTo(18.5f, 20.276f, 18.276f, 20.5f, 18f, 20.5f)
                horizontalLineTo(16.75f)
                curveTo(16.336f, 20.5f, 16f, 20.836f, 16f, 21.25f)
                curveTo(16f, 21.664f, 16.336f, 22f, 16.75f, 22f)
                horizontalLineTo(18f)
                curveTo(18.795f, 22f, 19.482f, 21.536f, 19.804f, 20.865f)
                lineTo(20.72f, 21.78f)
                curveTo(21.013f, 22.073f, 21.487f, 22.073f, 21.78f, 21.78f)
                curveTo(22.073f, 21.487f, 22.073f, 21.013f, 21.78f, 20.72f)
                lineTo(3.28f, 2.22f)
                close()
                moveTo(18.5f, 15.318f)
                lineTo(19.861f, 16.68f)
                curveTo(19.949f, 16.557f, 20f, 16.407f, 20f, 16.245f)
                verticalLineTo(13.75f)
                curveTo(20f, 13.336f, 19.664f, 13f, 19.25f, 13f)
                curveTo(18.836f, 13f, 18.5f, 13.336f, 18.5f, 13.75f)
                verticalLineTo(15.318f)
                close()
                moveTo(12.712f, 9.53f)
                lineTo(15.182f, 12f)
                horizontalLineTo(19.5f)
                curveTo(19.776f, 12f, 20f, 11.776f, 20f, 11.5f)
                verticalLineTo(10f)
                horizontalLineTo(14f)
                curveTo(13.509f, 10f, 13.06f, 9.823f, 12.712f, 9.53f)
                close()
                moveTo(12f, 8f)
                curveTo(12f, 8.491f, 12.177f, 8.94f, 12.47f, 9.288f)
                lineTo(5.306f, 2.124f)
                curveTo(5.522f, 2.044f, 5.756f, 2f, 6f, 2f)
                horizontalLineTo(12f)
                verticalLineTo(8f)
                close()
                moveTo(13.5f, 8f)
                verticalLineTo(2.5f)
                lineTo(19.5f, 8.5f)
                horizontalLineTo(14f)
                curveTo(13.724f, 8.5f, 13.5f, 8.276f, 13.5f, 8f)
                close()
                moveTo(5.5f, 13.75f)
                curveTo(5.5f, 13.336f, 5.164f, 13f, 4.75f, 13f)
                curveTo(4.336f, 13f, 4f, 13.336f, 4f, 13.75f)
                verticalLineTo(16.245f)
                curveTo(4f, 16.659f, 4.336f, 16.995f, 4.75f, 16.995f)
                curveTo(5.164f, 16.995f, 5.5f, 16.659f, 5.5f, 16.245f)
                verticalLineTo(13.75f)
                close()
                moveTo(10.25f, 20.5f)
                curveTo(9.836f, 20.5f, 9.5f, 20.836f, 9.5f, 21.25f)
                curveTo(9.5f, 21.664f, 9.836f, 22f, 10.25f, 22f)
                horizontalLineTo(13.75f)
                curveTo(14.164f, 22f, 14.5f, 21.664f, 14.5f, 21.25f)
                curveTo(14.5f, 20.836f, 14.164f, 20.5f, 13.75f, 20.5f)
                horizontalLineTo(10.25f)
                close()
                moveTo(4.75f, 18.5f)
                curveTo(5.164f, 18.5f, 5.5f, 18.836f, 5.5f, 19.25f)
                verticalLineTo(20f)
                curveTo(5.5f, 20.276f, 5.724f, 20.5f, 6f, 20.5f)
                horizontalLineTo(7.25f)
                curveTo(7.664f, 20.5f, 8f, 20.836f, 8f, 21.25f)
                curveTo(8f, 21.664f, 7.664f, 22f, 7.25f, 22f)
                horizontalLineTo(6f)
                curveTo(4.895f, 22f, 4f, 21.104f, 4f, 20f)
                verticalLineTo(19.25f)
                curveTo(4f, 18.836f, 4.336f, 18.5f, 4.75f, 18.5f)
                close()
            }
        }.build()

        return _DocumentSplitHintOff!!
    }

@Suppress("ObjectPropertyName")
private var _DocumentSplitHintOff: ImageVector? = null

@Preview
@Composable
private fun DocumentSplitHintOffPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.DocumentSplitHintOff, contentDescription = null)
    }
}
