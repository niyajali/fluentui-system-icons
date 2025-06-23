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

public val FluentIcons.Filled.DocumentDataLock: ImageVector
    get() {
        if (_DocumentDataLock != null) {
            return _DocumentDataLock!!
        }
        _DocumentDataLock = ImageVector.Builder(
            name = "Filled.DocumentDataLock",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(12f, 2f)
                verticalLineTo(8f)
                curveTo(12f, 9.105f, 12.895f, 10f, 14f, 10f)
                horizontalLineTo(20f)
                verticalLineTo(20f)
                curveTo(20f, 21.105f, 19.105f, 22f, 18f, 22f)
                horizontalLineTo(11.95f)
                curveTo(11.983f, 21.838f, 12f, 21.671f, 12f, 21.5f)
                verticalLineTo(16.5f)
                curveTo(12f, 15.29f, 11.141f, 14.282f, 10f, 14.05f)
                verticalLineTo(14f)
                curveTo(10f, 12.067f, 8.433f, 10.5f, 6.5f, 10.5f)
                curveTo(5.521f, 10.5f, 4.635f, 10.902f, 4f, 11.551f)
                verticalLineTo(4f)
                curveTo(4f, 2.895f, 4.895f, 2f, 6f, 2f)
                horizontalLineTo(12f)
                close()
                moveTo(13.5f, 2.5f)
                verticalLineTo(8f)
                curveTo(13.5f, 8.276f, 13.724f, 8.5f, 14f, 8.5f)
                horizontalLineTo(19.5f)
                lineTo(13.5f, 2.5f)
                close()
                moveTo(14.5f, 15.75f)
                curveTo(14.5f, 15.336f, 14.164f, 15f, 13.75f, 15f)
                curveTo(13.336f, 15f, 13f, 15.336f, 13f, 15.75f)
                verticalLineTo(18.25f)
                curveTo(13f, 18.664f, 13.336f, 19f, 13.75f, 19f)
                curveTo(14.164f, 19f, 14.5f, 18.664f, 14.5f, 18.25f)
                verticalLineTo(15.75f)
                close()
                moveTo(16.75f, 13f)
                curveTo(16.336f, 13f, 16f, 13.336f, 16f, 13.75f)
                verticalLineTo(18.25f)
                curveTo(16f, 18.664f, 16.336f, 19f, 16.75f, 19f)
                curveTo(17.164f, 19f, 17.5f, 18.664f, 17.5f, 18.25f)
                verticalLineTo(13.75f)
                curveTo(17.5f, 13.336f, 17.164f, 13f, 16.75f, 13f)
                close()
                moveTo(4f, 15f)
                verticalLineTo(14f)
                curveTo(4f, 12.619f, 5.119f, 11.5f, 6.5f, 11.5f)
                curveTo(7.881f, 11.5f, 9f, 12.619f, 9f, 14f)
                verticalLineTo(15f)
                horizontalLineTo(9.5f)
                curveTo(10.328f, 15f, 11f, 15.672f, 11f, 16.5f)
                verticalLineTo(21.5f)
                curveTo(11f, 22.328f, 10.328f, 23f, 9.5f, 23f)
                horizontalLineTo(3.5f)
                curveTo(2.672f, 23f, 2f, 22.328f, 2f, 21.5f)
                verticalLineTo(16.5f)
                curveTo(2f, 15.672f, 2.672f, 15f, 3.5f, 15f)
                horizontalLineTo(4f)
                close()
                moveTo(5.5f, 14f)
                verticalLineTo(15f)
                horizontalLineTo(7.5f)
                verticalLineTo(14f)
                curveTo(7.5f, 13.448f, 7.052f, 13f, 6.5f, 13f)
                curveTo(5.948f, 13f, 5.5f, 13.448f, 5.5f, 14f)
                close()
                moveTo(7.5f, 19f)
                curveTo(7.5f, 18.448f, 7.052f, 18f, 6.5f, 18f)
                curveTo(5.948f, 18f, 5.5f, 18.448f, 5.5f, 19f)
                curveTo(5.5f, 19.552f, 5.948f, 20f, 6.5f, 20f)
                curveTo(7.052f, 20f, 7.5f, 19.552f, 7.5f, 19f)
                close()
            }
        }.build()

        return _DocumentDataLock!!
    }

@Suppress("ObjectPropertyName")
private var _DocumentDataLock: ImageVector? = null

@Preview
@Composable
private fun DocumentDataLockPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.DocumentDataLock, contentDescription = null)
    }
}
