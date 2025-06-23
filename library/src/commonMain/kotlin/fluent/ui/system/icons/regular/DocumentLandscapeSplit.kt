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

public val FluentIcons.Regular.DocumentLandscapeSplit: ImageVector
    get() {
        if (_DocumentLandscapeSplit != null) {
            return _DocumentLandscapeSplit!!
        }
        _DocumentLandscapeSplit = ImageVector.Builder(
            name = "Regular.DocumentLandscapeSplit",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(3.5f, 6f)
                curveTo(3.5f, 5.724f, 3.725f, 5.5f, 4f, 5.5f)
                lineTo(10.5f, 5.5f)
                verticalLineTo(18.5f)
                horizontalLineTo(4f)
                curveTo(3.725f, 18.5f, 3.5f, 18.276f, 3.5f, 18f)
                lineTo(3.5f, 6f)
                close()
                moveTo(12f, 18.5f)
                verticalLineTo(5.5f)
                lineTo(14f, 5.5f)
                verticalLineTo(10f)
                curveTo(14f, 11.104f, 14.896f, 12f, 16f, 12f)
                lineTo(20.5f, 12f)
                verticalLineTo(18f)
                curveTo(20.5f, 18.276f, 20.275f, 18.5f, 20f, 18.5f)
                horizontalLineTo(12f)
                close()
                moveTo(15.5f, 6.622f)
                lineTo(19.379f, 10.5f)
                horizontalLineTo(16f)
                curveTo(15.725f, 10.5f, 15.5f, 10.276f, 15.5f, 10f)
                verticalLineTo(6.622f)
                close()
                moveTo(21.414f, 10.415f)
                lineTo(15.586f, 4.586f)
                curveTo(15.211f, 4.211f, 14.702f, 4f, 14.172f, 4f)
                horizontalLineTo(4f)
                curveTo(2.896f, 4f, 2f, 4.896f, 2f, 6f)
                verticalLineTo(18f)
                curveTo(2f, 19.104f, 2.896f, 20f, 4f, 20f)
                horizontalLineTo(20f)
                curveTo(21.104f, 20f, 22f, 19.104f, 22f, 18f)
                verticalLineTo(11.828f)
                curveTo(22f, 11.8f, 21.996f, 11.773f, 21.993f, 11.746f)
                curveTo(21.99f, 11.726f, 21.987f, 11.707f, 21.986f, 11.687f)
                curveTo(21.971f, 11.472f, 21.93f, 11.26f, 21.848f, 11.063f)
                curveTo(21.823f, 11.006f, 21.792f, 10.951f, 21.761f, 10.897f)
                curveTo(21.751f, 10.88f, 21.741f, 10.864f, 21.732f, 10.847f)
                curveTo(21.723f, 10.832f, 21.716f, 10.816f, 21.708f, 10.8f)
                curveTo(21.694f, 10.772f, 21.681f, 10.744f, 21.664f, 10.719f)
                curveTo(21.611f, 10.641f, 21.548f, 10.571f, 21.484f, 10.5f)
                curveTo(21.474f, 10.488f, 21.464f, 10.476f, 21.455f, 10.464f)
                curveTo(21.442f, 10.447f, 21.429f, 10.43f, 21.414f, 10.415f)
                close()
            }
        }.build()

        return _DocumentLandscapeSplit!!
    }

@Suppress("ObjectPropertyName")
private var _DocumentLandscapeSplit: ImageVector? = null

@Preview
@Composable
private fun DocumentLandscapeSplitPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.DocumentLandscapeSplit, contentDescription = null)
    }
}
