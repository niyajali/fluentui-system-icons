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

public val FluentIcons.Regular.Balloon: ImageVector
    get() {
        if (_Balloon != null) {
            return _Balloon!!
        }
        _Balloon = ImageVector.Builder(
            name = "Regular.Balloon",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(12.018f, 5.665f)
                curveTo(12.113f, 5.261f, 12.517f, 5.011f, 12.92f, 5.106f)
                curveTo(14.388f, 5.452f, 15.543f, 6.605f, 15.892f, 8.072f)
                curveTo(15.987f, 8.475f, 15.738f, 8.879f, 15.335f, 8.975f)
                curveTo(14.932f, 9.071f, 14.528f, 8.822f, 14.432f, 8.419f)
                curveTo(14.215f, 7.504f, 13.492f, 6.782f, 12.576f, 6.566f)
                curveTo(12.173f, 6.471f, 11.923f, 6.068f, 12.018f, 5.665f)
                close()
                moveTo(5f, 9f)
                curveTo(5f, 5.134f, 8.134f, 2f, 12f, 2f)
                curveTo(15.866f, 2f, 19f, 5.134f, 19f, 9f)
                curveTo(19f, 11.025f, 18.33f, 13.236f, 17.15f, 14.956f)
                curveTo(16.108f, 16.476f, 14.607f, 17.687f, 12.75f, 17.948f)
                verticalLineTo(18.25f)
                curveTo(12.75f, 18.664f, 13.086f, 19f, 13.5f, 19f)
                horizontalLineTo(16.75f)
                curveTo(17.993f, 19f, 19f, 20.007f, 19f, 21.25f)
                verticalLineTo(22.25f)
                curveTo(19f, 22.664f, 18.664f, 23f, 18.25f, 23f)
                curveTo(17.836f, 23f, 17.5f, 22.664f, 17.5f, 22.25f)
                verticalLineTo(21.25f)
                curveTo(17.5f, 20.836f, 17.164f, 20.5f, 16.75f, 20.5f)
                horizontalLineTo(13.5f)
                curveTo(12.257f, 20.5f, 11.25f, 19.493f, 11.25f, 18.25f)
                verticalLineTo(17.948f)
                curveTo(9.393f, 17.687f, 7.892f, 16.476f, 6.85f, 14.956f)
                curveTo(5.67f, 13.236f, 5f, 11.025f, 5f, 9f)
                close()
                moveTo(12f, 3.5f)
                curveTo(8.962f, 3.5f, 6.5f, 5.962f, 6.5f, 9f)
                curveTo(6.5f, 10.725f, 7.08f, 12.639f, 8.086f, 14.107f)
                curveTo(9.094f, 15.575f, 10.453f, 16.5f, 12f, 16.5f)
                curveTo(13.547f, 16.5f, 14.906f, 15.575f, 15.914f, 14.107f)
                curveTo(16.92f, 12.639f, 17.5f, 10.725f, 17.5f, 9f)
                curveTo(17.5f, 5.962f, 15.038f, 3.5f, 12f, 3.5f)
                close()
            }
        }.build()

        return _Balloon!!
    }

@Suppress("ObjectPropertyName")
private var _Balloon: ImageVector? = null

@Preview
@Composable
private fun BalloonPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.Balloon, contentDescription = null)
    }
}
