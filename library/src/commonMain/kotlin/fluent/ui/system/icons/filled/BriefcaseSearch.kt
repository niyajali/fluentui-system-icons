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

public val FluentIcons.Filled.BriefcaseSearch: ImageVector
    get() {
        if (_BriefcaseSearch != null) {
            return _BriefcaseSearch!!
        }
        _BriefcaseSearch = ImageVector.Builder(
            name = "Filled.BriefcaseSearch",
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
                verticalLineTo(10.6f)
                curveTo(3.75f, 10.216f, 4.6f, 10f, 5.5f, 10f)
                curveTo(7.36f, 10f, 9.005f, 10.923f, 10f, 12.337f)
                verticalLineTo(12f)
                curveTo(10f, 11.448f, 10.448f, 11f, 11f, 11f)
                horizontalLineTo(13f)
                curveTo(13.552f, 11f, 14f, 11.448f, 14f, 12f)
                verticalLineTo(12.5f)
                horizontalLineTo(19.25f)
                curveTo(20.216f, 12.5f, 21f, 11.717f, 21f, 10.75f)
                verticalLineTo(9.25f)
                curveTo(21f, 7.455f, 19.545f, 6f, 17.75f, 6f)
                horizontalLineTo(16f)
                verticalLineTo(4.25f)
                curveTo(16f, 3.007f, 14.993f, 2f, 13.75f, 2f)
                horizontalLineTo(10.25f)
                curveTo(9.007f, 2f, 8f, 3.007f, 8f, 4.25f)
                close()
                moveTo(17.75f, 20f)
                horizontalLineTo(12.475f)
                lineTo(10.425f, 17.95f)
                curveTo(10.793f, 17.213f, 11f, 16.38f, 11f, 15.5f)
                curveTo(11f, 15.331f, 10.992f, 15.165f, 10.978f, 15f)
                lineTo(11f, 15f)
                horizontalLineTo(13f)
                curveTo(13.552f, 15f, 14f, 14.552f, 14f, 14f)
                horizontalLineTo(19.25f)
                curveTo(19.894f, 14f, 20.495f, 13.813f, 21f, 13.489f)
                verticalLineTo(16.75f)
                curveTo(21f, 18.545f, 19.545f, 20f, 17.75f, 20f)
                close()
                moveTo(5.5f, 20f)
                curveTo(6.472f, 20f, 7.372f, 19.692f, 8.107f, 19.168f)
                lineTo(10.72f, 21.78f)
                curveTo(11.013f, 22.073f, 11.487f, 22.073f, 11.78f, 21.78f)
                curveTo(12.073f, 21.487f, 12.073f, 21.013f, 11.78f, 20.72f)
                lineTo(9.168f, 18.107f)
                curveTo(9.692f, 17.372f, 10f, 16.472f, 10f, 15.5f)
                curveTo(10f, 13.015f, 7.985f, 11f, 5.5f, 11f)
                curveTo(3.015f, 11f, 1f, 13.015f, 1f, 15.5f)
                curveTo(1f, 17.985f, 3.015f, 20f, 5.5f, 20f)
                close()
                moveTo(5.5f, 18.5f)
                curveTo(3.843f, 18.5f, 2.5f, 17.157f, 2.5f, 15.5f)
                curveTo(2.5f, 13.843f, 3.843f, 12.5f, 5.5f, 12.5f)
                curveTo(7.157f, 12.5f, 8.5f, 13.843f, 8.5f, 15.5f)
                curveTo(8.5f, 17.157f, 7.157f, 18.5f, 5.5f, 18.5f)
                close()
            }
        }.build()

        return _BriefcaseSearch!!
    }

@Suppress("ObjectPropertyName")
private var _BriefcaseSearch: ImageVector? = null

@Preview
@Composable
private fun BriefcaseSearchPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.BriefcaseSearch, contentDescription = null)
    }
}
