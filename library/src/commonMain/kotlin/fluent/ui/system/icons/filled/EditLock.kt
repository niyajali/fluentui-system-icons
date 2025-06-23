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

public val FluentIcons.Filled.EditLock: ImageVector
    get() {
        if (_EditLock != null) {
            return _EditLock!!
        }
        _EditLock = ImageVector.Builder(
            name = "Filled.EditLock",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(15.891f, 3.048f)
                curveTo(17.288f, 1.651f, 19.554f, 1.651f, 20.952f, 3.048f)
                curveTo(22.349f, 4.445f, 22.349f, 6.711f, 20.952f, 8.109f)
                lineTo(20.06f, 9.001f)
                lineTo(15f, 3.94f)
                lineTo(15.891f, 3.048f)
                close()
                moveTo(13.939f, 5.001f)
                lineTo(3.941f, 15f)
                curveTo(3.535f, 15.406f, 3.249f, 15.917f, 3.116f, 16.476f)
                lineTo(2.02f, 21.078f)
                curveTo(1.96f, 21.331f, 2.036f, 21.598f, 2.22f, 21.782f)
                curveTo(2.404f, 21.966f, 2.67f, 22.041f, 2.924f, 21.981f)
                lineTo(7.525f, 20.885f)
                curveTo(8.084f, 20.752f, 8.595f, 20.467f, 9.002f, 20.06f)
                lineTo(12f, 17.062f)
                verticalLineTo(15.5f)
                curveTo(12f, 14.29f, 12.859f, 13.282f, 14f, 13.05f)
                verticalLineTo(13f)
                curveTo(14f, 11.067f, 15.567f, 9.5f, 17.5f, 9.5f)
                curveTo(17.892f, 9.5f, 18.27f, 9.565f, 18.622f, 9.684f)
                lineTo(13.939f, 5.001f)
                close()
                moveTo(15f, 14f)
                verticalLineTo(13f)
                curveTo(15f, 11.619f, 16.119f, 10.5f, 17.5f, 10.5f)
                curveTo(18.881f, 10.5f, 20f, 11.619f, 20f, 13f)
                verticalLineTo(14f)
                horizontalLineTo(20.5f)
                curveTo(21.328f, 14f, 22f, 14.672f, 22f, 15.5f)
                verticalLineTo(20.5f)
                curveTo(22f, 21.328f, 21.328f, 22f, 20.5f, 22f)
                horizontalLineTo(14.5f)
                curveTo(13.672f, 22f, 13f, 21.328f, 13f, 20.5f)
                verticalLineTo(15.5f)
                curveTo(13f, 14.672f, 13.672f, 14f, 14.5f, 14f)
                horizontalLineTo(15f)
                close()
                moveTo(16.5f, 13f)
                verticalLineTo(14f)
                horizontalLineTo(18.5f)
                verticalLineTo(13f)
                curveTo(18.5f, 12.448f, 18.052f, 12f, 17.5f, 12f)
                curveTo(16.948f, 12f, 16.5f, 12.448f, 16.5f, 13f)
                close()
                moveTo(18.5f, 18f)
                curveTo(18.5f, 17.448f, 18.052f, 17f, 17.5f, 17f)
                curveTo(16.948f, 17f, 16.5f, 17.448f, 16.5f, 18f)
                curveTo(16.5f, 18.552f, 16.948f, 19f, 17.5f, 19f)
                curveTo(18.052f, 19f, 18.5f, 18.552f, 18.5f, 18f)
                close()
            }
        }.build()

        return _EditLock!!
    }

@Suppress("ObjectPropertyName")
private var _EditLock: ImageVector? = null

@Preview
@Composable
private fun EditLockPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.EditLock, contentDescription = null)
    }
}
