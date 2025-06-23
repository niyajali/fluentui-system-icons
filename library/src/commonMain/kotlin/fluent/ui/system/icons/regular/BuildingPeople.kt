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

public val FluentIcons.Regular.BuildingPeople: ImageVector
    get() {
        if (_BuildingPeople != null) {
            return _BuildingPeople!!
        }
        _BuildingPeople = ImageVector.Builder(
            name = "Regular.BuildingPeople",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(4.75f, 22f)
                curveTo(4.336f, 22f, 4f, 21.664f, 4f, 21.25f)
                verticalLineTo(4.25f)
                curveTo(4f, 3.007f, 5.007f, 2f, 6.25f, 2f)
                horizontalLineTo(14.25f)
                curveTo(15.493f, 2f, 16.5f, 3.007f, 16.5f, 4.25f)
                verticalLineTo(9.5f)
                horizontalLineTo(17.75f)
                curveTo(18.993f, 9.5f, 20f, 10.507f, 20f, 11.75f)
                verticalLineTo(13.05f)
                curveTo(19.39f, 13.174f, 18.861f, 13.52f, 18.5f, 14f)
                verticalLineTo(11.75f)
                curveTo(18.5f, 11.336f, 18.164f, 11f, 17.75f, 11f)
                horizontalLineTo(15.75f)
                curveTo(15.336f, 11f, 15f, 10.664f, 15f, 10.25f)
                verticalLineTo(4.25f)
                curveTo(15f, 3.836f, 14.664f, 3.5f, 14.25f, 3.5f)
                horizontalLineTo(6.25f)
                curveTo(5.836f, 3.5f, 5.5f, 3.836f, 5.5f, 4.25f)
                verticalLineTo(20.5f)
                horizontalLineTo(11.028f)
                curveTo(11.086f, 21.008f, 11.237f, 21.524f, 11.506f, 22f)
                horizontalLineTo(4.75f)
                close()
                moveTo(7.5f, 6.5f)
                curveTo(7.5f, 5.948f, 7.948f, 5.5f, 8.5f, 5.5f)
                curveTo(9.052f, 5.5f, 9.5f, 5.948f, 9.5f, 6.5f)
                curveTo(9.5f, 7.052f, 9.052f, 7.5f, 8.5f, 7.5f)
                curveTo(7.948f, 7.5f, 7.5f, 7.052f, 7.5f, 6.5f)
                close()
                moveTo(7.5f, 13.5f)
                curveTo(7.5f, 12.948f, 7.948f, 12.5f, 8.5f, 12.5f)
                curveTo(9.052f, 12.5f, 9.5f, 12.948f, 9.5f, 13.5f)
                curveTo(9.5f, 14.052f, 9.052f, 14.5f, 8.5f, 14.5f)
                curveTo(7.948f, 14.5f, 7.5f, 14.052f, 7.5f, 13.5f)
                close()
                moveTo(12f, 9f)
                curveTo(11.448f, 9f, 11f, 9.448f, 11f, 10f)
                curveTo(11f, 10.552f, 11.448f, 11f, 12f, 11f)
                curveTo(12.552f, 11f, 13f, 10.552f, 13f, 10f)
                curveTo(13f, 9.448f, 12.552f, 9f, 12f, 9f)
                close()
                moveTo(11f, 6.5f)
                curveTo(11f, 5.948f, 11.448f, 5.5f, 12f, 5.5f)
                curveTo(12.552f, 5.5f, 13f, 5.948f, 13f, 6.5f)
                curveTo(13f, 7.052f, 12.552f, 7.5f, 12f, 7.5f)
                curveTo(11.448f, 7.5f, 11f, 7.052f, 11f, 6.5f)
                close()
                moveTo(8.5f, 9f)
                curveTo(7.948f, 9f, 7.5f, 9.448f, 7.5f, 10f)
                curveTo(7.5f, 10.552f, 7.948f, 11f, 8.5f, 11f)
                curveTo(9.052f, 11f, 9.5f, 10.552f, 9.5f, 10f)
                curveTo(9.5f, 9.448f, 9.052f, 9f, 8.5f, 9f)
                close()
                moveTo(15.5f, 17f)
                curveTo(16.605f, 17f, 17.5f, 16.105f, 17.5f, 15f)
                curveTo(17.5f, 13.895f, 16.605f, 13f, 15.5f, 13f)
                curveTo(14.395f, 13f, 13.5f, 13.895f, 13.5f, 15f)
                curveTo(13.5f, 16.105f, 14.395f, 17f, 15.5f, 17f)
                close()
                moveTo(15.5f, 23f)
                curveTo(18.067f, 23f, 19f, 21.479f, 19f, 20f)
                curveTo(19f, 18.895f, 18.105f, 18f, 17f, 18f)
                horizontalLineTo(14f)
                curveTo(12.895f, 18f, 12f, 18.895f, 12f, 20f)
                curveTo(12f, 21.479f, 12.933f, 23f, 15.5f, 23f)
                close()
                moveTo(19.507f, 21.978f)
                curveTo(19.663f, 21.993f, 19.827f, 22f, 20f, 22f)
                curveTo(22.2f, 22f, 23f, 20.784f, 23f, 19.6f)
                curveTo(23f, 18.716f, 22.284f, 18f, 21.4f, 18f)
                horizontalLineTo(19.236f)
                curveTo(19.711f, 18.531f, 20f, 19.232f, 20f, 20f)
                curveTo(20f, 20.656f, 19.856f, 21.35f, 19.507f, 21.978f)
                close()
                moveTo(22f, 15.5f)
                curveTo(22f, 16.328f, 21.328f, 17f, 20.5f, 17f)
                curveTo(19.672f, 17f, 19f, 16.328f, 19f, 15.5f)
                curveTo(19f, 14.672f, 19.672f, 14f, 20.5f, 14f)
                curveTo(21.328f, 14f, 22f, 14.672f, 22f, 15.5f)
                close()
            }
        }.build()

        return _BuildingPeople!!
    }

@Suppress("ObjectPropertyName")
private var _BuildingPeople: ImageVector? = null

@Preview
@Composable
private fun BuildingPeoplePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.BuildingPeople, contentDescription = null)
    }
}
