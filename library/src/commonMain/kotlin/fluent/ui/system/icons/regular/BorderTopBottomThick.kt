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
import org.jetbrains.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentIcons

public val FluentIcons.Regular.BorderTopBottomThick: ImageVector
    get() {
        if (_BorderTopBottomThick != null) {
            return _BorderTopBottomThick!!
        }
        _BorderTopBottomThick = ImageVector.Builder(
            name = "Regular.BorderTopBottomThick",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(3f, 6.25f)
                curveTo(3f, 6.664f, 3.336f, 7f, 3.75f, 7f)
                curveTo(4.164f, 7f, 4.5f, 6.664f, 4.5f, 6.25f)
                verticalLineTo(5.75f)
                curveTo(4.5f, 5.06f, 5.06f, 4.5f, 5.75f, 4.5f)
                horizontalLineTo(18.25f)
                curveTo(18.94f, 4.5f, 19.5f, 5.06f, 19.5f, 5.75f)
                verticalLineTo(6.25f)
                curveTo(19.5f, 6.664f, 19.836f, 7f, 20.25f, 7f)
                curveTo(20.664f, 7f, 21f, 6.664f, 21f, 6.25f)
                verticalLineTo(5.75f)
                curveTo(21f, 4.231f, 19.769f, 3f, 18.25f, 3f)
                horizontalLineTo(5.75f)
                curveTo(4.231f, 3f, 3f, 4.231f, 3f, 5.75f)
                verticalLineTo(6.25f)
                close()
                moveTo(4.5f, 10.75f)
                curveTo(4.5f, 10.336f, 4.164f, 10f, 3.75f, 10f)
                curveTo(3.336f, 10f, 3f, 10.336f, 3f, 10.75f)
                verticalLineTo(13.25f)
                curveTo(3f, 13.664f, 3.336f, 14f, 3.75f, 14f)
                curveTo(4.164f, 14f, 4.5f, 13.664f, 4.5f, 13.25f)
                verticalLineTo(10.75f)
                close()
                moveTo(19.5f, 10.75f)
                curveTo(19.5f, 10.336f, 19.836f, 10f, 20.25f, 10f)
                curveTo(20.664f, 10f, 21f, 10.336f, 21f, 10.75f)
                verticalLineTo(13.25f)
                curveTo(21f, 13.664f, 20.664f, 14f, 20.25f, 14f)
                curveTo(19.836f, 14f, 19.5f, 13.664f, 19.5f, 13.25f)
                verticalLineTo(10.75f)
                close()
                moveTo(4f, 17f)
                curveTo(3.448f, 17f, 3f, 17.448f, 3f, 18f)
                curveTo(3f, 19.657f, 4.343f, 21f, 6f, 21f)
                horizontalLineTo(18f)
                curveTo(19.657f, 21f, 21f, 19.657f, 21f, 18f)
                curveTo(21f, 17.448f, 20.552f, 17f, 20f, 17f)
                curveTo(19.448f, 17f, 19f, 17.448f, 19f, 18f)
                curveTo(19f, 18.552f, 18.552f, 19f, 18f, 19f)
                horizontalLineTo(6f)
                curveTo(5.448f, 19f, 5f, 18.552f, 5f, 18f)
                curveTo(5f, 17.448f, 4.552f, 17f, 4f, 17f)
                close()
            }
        }.build()

        return _BorderTopBottomThick!!
    }

@Suppress("ObjectPropertyName")
private var _BorderTopBottomThick: ImageVector? = null

@Preview
@Composable
private fun BorderTopBottomThickPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.BorderTopBottomThick, contentDescription = null)
    }
}
