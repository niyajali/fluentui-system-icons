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

public val FluentIcons.Filled.ShareScreenPersonOverlayInside: ImageVector
    get() {
        if (_ShareScreenPersonOverlayInside != null) {
            return _ShareScreenPersonOverlayInside!!
        }
        _ShareScreenPersonOverlayInside = ImageVector.Builder(
            name = "Filled.ShareScreenPersonOverlayInside",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(2f, 7.25f)
                curveTo(2f, 5.455f, 3.455f, 4f, 5.25f, 4f)
                horizontalLineTo(18.75f)
                curveTo(20.545f, 4f, 22f, 5.455f, 22f, 7.25f)
                verticalLineTo(16.75f)
                curveTo(22f, 18.545f, 20.545f, 20f, 18.75f, 20f)
                horizontalLineTo(5.25f)
                curveTo(3.455f, 20f, 2f, 18.545f, 2f, 16.75f)
                verticalLineTo(7.25f)
                close()
                moveTo(16f, 12f)
                curveTo(17.105f, 12f, 18f, 11.105f, 18f, 10f)
                curveTo(18f, 8.895f, 17.105f, 8f, 16f, 8f)
                curveTo(14.895f, 8f, 14f, 8.895f, 14f, 10f)
                curveTo(14f, 11.105f, 14.895f, 12f, 16f, 12f)
                close()
                moveTo(5f, 8f)
                verticalLineTo(12f)
                curveTo(5f, 12.552f, 5.448f, 13f, 6f, 13f)
                horizontalLineTo(11f)
                curveTo(11.552f, 13f, 12f, 12.552f, 12f, 12f)
                verticalLineTo(8f)
                curveTo(12f, 7.448f, 11.552f, 7f, 11f, 7f)
                horizontalLineTo(6f)
                curveTo(5.448f, 7f, 5f, 7.448f, 5f, 8f)
                close()
                moveTo(14f, 13f)
                curveTo(13.448f, 13f, 13f, 13.448f, 13f, 14f)
                verticalLineTo(14.25f)
                curveTo(13f, 15.769f, 14.231f, 17f, 15.75f, 17f)
                horizontalLineTo(16.25f)
                curveTo(17.769f, 17f, 19f, 15.769f, 19f, 14.25f)
                verticalLineTo(14f)
                curveTo(19f, 13.448f, 18.552f, 13f, 18f, 13f)
                horizontalLineTo(14f)
                close()
            }
        }.build()

        return _ShareScreenPersonOverlayInside!!
    }

@Suppress("ObjectPropertyName")
private var _ShareScreenPersonOverlayInside: ImageVector? = null

@Preview
@Composable
private fun ShareScreenPersonOverlayInsidePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.ShareScreenPersonOverlayInside, contentDescription = null)
    }
}
