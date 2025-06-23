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

public val FluentIcons.Regular.Guardian: ImageVector
    get() {
        if (_Guardian != null) {
            return _Guardian!!
        }
        _Guardian = ImageVector.Builder(
            name = "Regular.Guardian",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(10.5f, 5f)
                curveTo(10.5f, 6.657f, 9.157f, 8f, 7.5f, 8f)
                curveTo(5.843f, 8f, 4.5f, 6.657f, 4.5f, 5f)
                curveTo(4.5f, 3.343f, 5.843f, 2f, 7.5f, 2f)
                curveTo(9.157f, 2f, 10.5f, 3.343f, 10.5f, 5f)
                close()
                moveTo(9f, 5f)
                curveTo(9f, 4.172f, 8.328f, 3.5f, 7.5f, 3.5f)
                curveTo(6.672f, 3.5f, 6f, 4.172f, 6f, 5f)
                curveTo(6f, 5.828f, 6.672f, 6.5f, 7.5f, 6.5f)
                curveTo(8.328f, 6.5f, 9f, 5.828f, 9f, 5f)
                close()
                moveTo(19f, 7.5f)
                curveTo(19f, 8.881f, 17.881f, 10f, 16.5f, 10f)
                curveTo(15.119f, 10f, 14f, 8.881f, 14f, 7.5f)
                curveTo(14f, 6.119f, 15.119f, 5f, 16.5f, 5f)
                curveTo(17.881f, 5f, 19f, 6.119f, 19f, 7.5f)
                close()
                moveTo(17.5f, 7.5f)
                curveTo(17.5f, 6.948f, 17.052f, 6.5f, 16.5f, 6.5f)
                curveTo(15.948f, 6.5f, 15.5f, 6.948f, 15.5f, 7.5f)
                curveTo(15.5f, 8.052f, 15.948f, 8.5f, 16.5f, 8.5f)
                curveTo(17.052f, 8.5f, 17.5f, 8.052f, 17.5f, 7.5f)
                close()
                moveTo(13.396f, 10.75f)
                curveTo(13.07f, 9.596f, 12.009f, 8.75f, 10.75f, 8.75f)
                horizontalLineTo(4.75f)
                curveTo(3.231f, 8.75f, 2f, 9.981f, 2f, 11.5f)
                verticalLineTo(14.5f)
                curveTo(2f, 15.605f, 2.895f, 16.5f, 4f, 16.5f)
                curveTo(4.173f, 16.5f, 4.34f, 16.478f, 4.5f, 16.437f)
                verticalLineTo(20f)
                curveTo(4.5f, 21.105f, 5.395f, 22f, 6.5f, 22f)
                curveTo(6.973f, 22f, 7.408f, 21.836f, 7.75f, 21.561f)
                curveTo(8.092f, 21.836f, 8.527f, 22f, 9f, 22f)
                curveTo(10.105f, 22f, 11f, 21.105f, 11f, 20f)
                verticalLineTo(16.437f)
                curveTo(11.16f, 16.478f, 11.327f, 16.5f, 11.5f, 16.5f)
                curveTo(12.432f, 16.5f, 13.215f, 15.863f, 13.437f, 15f)
                horizontalLineTo(13.5f)
                verticalLineTo(20f)
                curveTo(13.5f, 21.105f, 14.395f, 22f, 15.5f, 22f)
                curveTo(15.973f, 22f, 16.408f, 21.836f, 16.75f, 21.561f)
                curveTo(17.092f, 21.836f, 17.527f, 22f, 18f, 22f)
                curveTo(19.105f, 22f, 20f, 21.105f, 20f, 20f)
                verticalLineTo(17.187f)
                curveTo(20.16f, 17.228f, 20.327f, 17.25f, 20.5f, 17.25f)
                curveTo(21.605f, 17.25f, 22.5f, 16.355f, 22.5f, 15.25f)
                verticalLineTo(13.5f)
                curveTo(22.5f, 11.981f, 21.269f, 10.75f, 19.75f, 10.75f)
                horizontalLineTo(13.396f)
                close()
                moveTo(11f, 14.5f)
                verticalLineTo(12f)
                curveTo(11f, 11.586f, 10.664f, 11.25f, 10.25f, 11.25f)
                curveTo(9.836f, 11.25f, 9.5f, 11.586f, 9.5f, 12f)
                verticalLineTo(20f)
                curveTo(9.5f, 20.276f, 9.276f, 20.5f, 9f, 20.5f)
                curveTo(8.724f, 20.5f, 8.5f, 20.276f, 8.5f, 20f)
                verticalLineTo(16.5f)
                curveTo(8.5f, 16.086f, 8.164f, 15.75f, 7.75f, 15.75f)
                curveTo(7.336f, 15.75f, 7f, 16.086f, 7f, 16.5f)
                verticalLineTo(20f)
                curveTo(7f, 20.276f, 6.776f, 20.5f, 6.5f, 20.5f)
                curveTo(6.224f, 20.5f, 6f, 20.276f, 6f, 20f)
                verticalLineTo(12f)
                curveTo(6f, 11.586f, 5.664f, 11.25f, 5.25f, 11.25f)
                curveTo(4.836f, 11.25f, 4.5f, 11.586f, 4.5f, 12f)
                verticalLineTo(14.5f)
                curveTo(4.5f, 14.776f, 4.276f, 15f, 4f, 15f)
                curveTo(3.724f, 15f, 3.5f, 14.776f, 3.5f, 14.5f)
                verticalLineTo(11.5f)
                curveTo(3.5f, 10.81f, 4.06f, 10.25f, 4.75f, 10.25f)
                horizontalLineTo(10.75f)
                curveTo(11.44f, 10.25f, 12f, 10.81f, 12f, 11.5f)
                verticalLineTo(14.5f)
                curveTo(12f, 14.776f, 11.776f, 15f, 11.5f, 15f)
                curveTo(11.224f, 15f, 11f, 14.776f, 11f, 14.5f)
                close()
                moveTo(13.5f, 12.25f)
                horizontalLineTo(19.75f)
                curveTo(20.44f, 12.25f, 21f, 12.81f, 21f, 13.5f)
                verticalLineTo(15.25f)
                curveTo(21f, 15.526f, 20.776f, 15.75f, 20.5f, 15.75f)
                curveTo(20.224f, 15.75f, 20f, 15.526f, 20f, 15.25f)
                verticalLineTo(14f)
                curveTo(20f, 13.586f, 19.664f, 13.25f, 19.25f, 13.25f)
                curveTo(18.836f, 13.25f, 18.5f, 13.586f, 18.5f, 14f)
                verticalLineTo(20f)
                curveTo(18.5f, 20.276f, 18.276f, 20.5f, 18f, 20.5f)
                curveTo(17.724f, 20.5f, 17.5f, 20.276f, 17.5f, 20f)
                verticalLineTo(17.5f)
                curveTo(17.5f, 17.086f, 17.164f, 16.75f, 16.75f, 16.75f)
                curveTo(16.336f, 16.75f, 16f, 17.086f, 16f, 17.5f)
                verticalLineTo(20f)
                curveTo(16f, 20.276f, 15.776f, 20.5f, 15.5f, 20.5f)
                curveTo(15.224f, 20.5f, 15f, 20.276f, 15f, 20f)
                verticalLineTo(14.25f)
                curveTo(15f, 13.836f, 14.664f, 13.5f, 14.25f, 13.5f)
                horizontalLineTo(13.5f)
                verticalLineTo(12.25f)
                close()
            }
        }.build()

        return _Guardian!!
    }

@Suppress("ObjectPropertyName")
private var _Guardian: ImageVector? = null

@Preview
@Composable
private fun GuardianPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.Guardian, contentDescription = null)
    }
}
