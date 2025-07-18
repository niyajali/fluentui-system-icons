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

public val FluentIcons.Filled.BriefcaseMedical: ImageVector
    get() {
        if (_BriefcaseMedical != null) {
            return _BriefcaseMedical!!
        }
        _BriefcaseMedical = ImageVector.Builder(
            name = "Filled.BriefcaseMedical",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(10.25f, 3.5f)
                horizontalLineTo(13.75f)
                curveTo(14.164f, 3.5f, 14.5f, 3.836f, 14.5f, 4.25f)
                verticalLineTo(6f)
                horizontalLineTo(9.5f)
                verticalLineTo(4.25f)
                curveTo(9.5f, 3.836f, 9.836f, 3.5f, 10.25f, 3.5f)
                close()
                moveTo(8f, 4.25f)
                verticalLineTo(6f)
                horizontalLineTo(6.25f)
                curveTo(4.455f, 6f, 3f, 7.455f, 3f, 9.25f)
                verticalLineTo(16.75f)
                curveTo(3f, 18.545f, 4.455f, 20f, 6.25f, 20f)
                horizontalLineTo(17.75f)
                curveTo(19.545f, 20f, 21f, 18.545f, 21f, 16.75f)
                verticalLineTo(9.25f)
                curveTo(21f, 7.455f, 19.545f, 6f, 17.75f, 6f)
                horizontalLineTo(16f)
                verticalLineTo(4.25f)
                curveTo(16f, 3.007f, 14.993f, 2f, 13.75f, 2f)
                horizontalLineTo(10.25f)
                curveTo(9.007f, 2f, 8f, 3.007f, 8f, 4.25f)
                close()
                moveTo(11.5f, 10.75f)
                curveTo(11.5f, 10.336f, 11.836f, 10f, 12.25f, 10f)
                curveTo(12.664f, 10f, 13f, 10.336f, 13f, 10.75f)
                verticalLineTo(12.5f)
                horizontalLineTo(14.75f)
                curveTo(15.164f, 12.5f, 15.5f, 12.836f, 15.5f, 13.25f)
                curveTo(15.5f, 13.664f, 15.164f, 14f, 14.75f, 14f)
                horizontalLineTo(13f)
                verticalLineTo(15.75f)
                curveTo(13f, 16.164f, 12.664f, 16.5f, 12.25f, 16.5f)
                curveTo(11.836f, 16.5f, 11.5f, 16.164f, 11.5f, 15.75f)
                verticalLineTo(14f)
                horizontalLineTo(9.75f)
                curveTo(9.336f, 14f, 9f, 13.664f, 9f, 13.25f)
                curveTo(9f, 12.836f, 9.336f, 12.5f, 9.75f, 12.5f)
                horizontalLineTo(11.5f)
                verticalLineTo(10.75f)
                close()
            }
        }.build()

        return _BriefcaseMedical!!
    }

@Suppress("ObjectPropertyName")
private var _BriefcaseMedical: ImageVector? = null

@Preview
@Composable
private fun BriefcaseMedicalPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.BriefcaseMedical, contentDescription = null)
    }
}
