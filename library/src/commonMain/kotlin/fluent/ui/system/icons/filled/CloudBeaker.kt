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

public val FluentIcons.Filled.CloudBeaker: ImageVector
    get() {
        if (_CloudBeaker != null) {
            return _CloudBeaker!!
        }
        _CloudBeaker = ImageVector.Builder(
            name = "Filled.CloudBeaker",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(6.08f, 9.019f)
                curveTo(6.548f, 6.172f, 9.02f, 4f, 12f, 4f)
                curveTo(14.221f, 4f, 16.16f, 5.207f, 17.197f, 7f)
                curveTo(17.708f, 7.883f, 18f, 8.907f, 18f, 10f)
                horizontalLineTo(15.75f)
                curveTo(14.783f, 10f, 14f, 10.783f, 14f, 11.75f)
                curveTo(14f, 12.632f, 14.652f, 13.361f, 15.5f, 13.482f)
                verticalLineTo(15.195f)
                curveTo(15.5f, 15.369f, 15.455f, 15.54f, 15.368f, 15.691f)
                lineTo(14.051f, 18f)
                horizontalLineTo(6.5f)
                curveTo(4.015f, 18f, 2f, 15.985f, 2f, 13.5f)
                curveTo(2f, 11.156f, 3.792f, 9.231f, 6.08f, 9.019f)
                close()
                moveTo(16.5f, 12.5f)
                horizontalLineTo(15.75f)
                curveTo(15.336f, 12.5f, 15f, 12.164f, 15f, 11.75f)
                curveTo(15f, 11.336f, 15.336f, 11f, 15.75f, 11f)
                horizontalLineTo(21.25f)
                curveTo(21.664f, 11f, 22f, 11.336f, 22f, 11.75f)
                curveTo(22f, 12.164f, 21.664f, 12.5f, 21.25f, 12.5f)
                horizontalLineTo(20.5f)
                verticalLineTo(15.197f)
                curveTo(20.5f, 15.545f, 20.591f, 15.887f, 20.763f, 16.189f)
                lineTo(21.226f, 17f)
                horizontalLineTo(15.773f)
                lineTo(16.237f, 16.186f)
                curveTo(16.409f, 15.884f, 16.5f, 15.543f, 16.5f, 15.195f)
                verticalLineTo(12.5f)
                close()
                moveTo(14.199f, 19.757f)
                lineTo(15.202f, 18f)
                horizontalLineTo(21.797f)
                lineTo(22.799f, 19.757f)
                curveTo(23.37f, 20.757f, 22.648f, 22f, 21.497f, 22f)
                horizontalLineTo(15.502f)
                curveTo(14.351f, 22f, 13.629f, 20.757f, 14.199f, 19.757f)
                close()
            }
        }.build()

        return _CloudBeaker!!
    }

@Suppress("ObjectPropertyName")
private var _CloudBeaker: ImageVector? = null

@Preview
@Composable
private fun CloudBeakerPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.CloudBeaker, contentDescription = null)
    }
}
