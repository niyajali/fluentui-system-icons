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

public val FluentIcons.Filled.ScanType: ImageVector
    get() {
        if (_ScanType != null) {
            return _ScanType!!
        }
        _ScanType = ImageVector.Builder(
            name = "Filled.ScanType",
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
                moveTo(6.75f, 8f)
                curveTo(6.75f, 7.448f, 7.198f, 7f, 7.75f, 7f)
                horizontalLineTo(16.25f)
                curveTo(16.802f, 7f, 17.25f, 7.448f, 17.25f, 8f)
                verticalLineTo(9.5f)
                curveTo(17.25f, 10.052f, 16.802f, 10.5f, 16.25f, 10.5f)
                curveTo(15.698f, 10.5f, 15.25f, 10.052f, 15.25f, 9.5f)
                verticalLineTo(9f)
                horizontalLineTo(13f)
                verticalLineTo(15f)
                horizontalLineTo(14.25f)
                curveTo(14.802f, 15f, 15.25f, 15.448f, 15.25f, 16f)
                curveTo(15.25f, 16.552f, 14.802f, 17f, 14.25f, 17f)
                horizontalLineTo(9.75f)
                curveTo(9.198f, 17f, 8.75f, 16.552f, 8.75f, 16f)
                curveTo(8.75f, 15.448f, 9.198f, 15f, 9.75f, 15f)
                horizontalLineTo(11f)
                verticalLineTo(9f)
                horizontalLineTo(8.75f)
                verticalLineTo(9.5f)
                curveTo(8.75f, 10.052f, 8.302f, 10.5f, 7.75f, 10.5f)
                curveTo(7.198f, 10.5f, 6.75f, 10.052f, 6.75f, 9.5f)
                verticalLineTo(8f)
                close()
            }
        }.build()

        return _ScanType!!
    }

@Suppress("ObjectPropertyName")
private var _ScanType: ImageVector? = null

@Preview
@Composable
private fun ScanTypePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.ScanType, contentDescription = null)
    }
}
