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

public val FluentIcons.Regular.StarDismiss: ImageVector
    get() {
        if (_StarDismiss != null) {
            return _StarDismiss!!
        }
        _StarDismiss = ImageVector.Builder(
            name = "Regular.StarDismiss",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(10.788f, 3.103f)
                curveTo(11.283f, 2.1f, 12.714f, 2.1f, 13.209f, 3.103f)
                lineTo(15.567f, 7.881f)
                lineTo(20.84f, 8.647f)
                curveTo(21.947f, 8.808f, 22.389f, 10.169f, 21.588f, 10.95f)
                lineTo(20.683f, 11.832f)
                curveTo(20.21f, 11.566f, 19.702f, 11.358f, 19.166f, 11.216f)
                lineTo(20.323f, 10.088f)
                lineTo(15.273f, 9.354f)
                curveTo(14.833f, 9.29f, 14.453f, 9.014f, 14.257f, 8.615f)
                lineTo(11.998f, 4.04f)
                lineTo(9.74f, 8.615f)
                curveTo(9.543f, 9.014f, 9.163f, 9.29f, 8.724f, 9.354f)
                lineTo(3.674f, 10.088f)
                lineTo(7.328f, 13.649f)
                curveTo(7.646f, 13.96f, 7.791f, 14.406f, 7.716f, 14.844f)
                lineTo(6.854f, 19.874f)
                lineTo(11.003f, 17.692f)
                curveTo(11.019f, 18.235f, 11.101f, 18.76f, 11.241f, 19.262f)
                lineTo(7.283f, 21.343f)
                curveTo(6.292f, 21.864f, 5.135f, 21.023f, 5.324f, 19.92f)
                lineTo(6.224f, 14.669f)
                lineTo(2.409f, 10.95f)
                curveTo(1.608f, 10.169f, 2.05f, 8.808f, 3.157f, 8.647f)
                lineTo(8.43f, 7.881f)
                lineTo(10.788f, 3.103f)
                close()
                moveTo(23f, 17.5f)
                curveTo(23f, 20.538f, 20.538f, 23f, 17.5f, 23f)
                curveTo(14.462f, 23f, 12f, 20.538f, 12f, 17.5f)
                curveTo(12f, 14.463f, 14.462f, 12f, 17.5f, 12f)
                curveTo(20.538f, 12f, 23f, 14.463f, 23f, 17.5f)
                close()
                moveTo(15.854f, 15.147f)
                curveTo(15.658f, 14.952f, 15.342f, 14.952f, 15.146f, 15.147f)
                curveTo(14.951f, 15.342f, 14.951f, 15.659f, 15.146f, 15.854f)
                lineTo(16.793f, 17.5f)
                lineTo(15.146f, 19.147f)
                curveTo(14.951f, 19.342f, 14.951f, 19.659f, 15.146f, 19.854f)
                curveTo(15.342f, 20.049f, 15.658f, 20.049f, 15.854f, 19.854f)
                lineTo(17.5f, 18.208f)
                lineTo(19.146f, 19.854f)
                curveTo(19.342f, 20.049f, 19.658f, 20.049f, 19.854f, 19.854f)
                curveTo(20.049f, 19.659f, 20.049f, 19.342f, 19.854f, 19.147f)
                lineTo(18.207f, 17.5f)
                lineTo(19.854f, 15.854f)
                curveTo(20.049f, 15.659f, 20.049f, 15.342f, 19.854f, 15.147f)
                curveTo(19.658f, 14.952f, 19.342f, 14.952f, 19.146f, 15.147f)
                lineTo(17.5f, 16.793f)
                lineTo(15.854f, 15.147f)
                close()
            }
        }.build()

        return _StarDismiss!!
    }

@Suppress("ObjectPropertyName")
private var _StarDismiss: ImageVector? = null

@Preview
@Composable
private fun StarDismissPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.StarDismiss, contentDescription = null)
    }
}
